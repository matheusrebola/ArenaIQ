package arenaiq.encaminhador.evento.core.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import arenaiq.encaminhador.evento.core.models.Acontecimentos;
import arenaiq.encaminhador.evento.core.models.Eventos;
import arenaiq.encaminhador.evento.core.models.Historia;
import arenaiq.encaminhador.evento.core.models.enums.ESagaStatus;
import arenaiq.encaminhador.evento.core.repositories.AcontecimentosRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class AcontecimentosService {
  private static final String CURRENT_SOURCE = "EVENTOS_SERVICE";
  private final AcontecimentosRepository repository;

  public Acontecimentos salvar(Acontecimentos a){
    return repository.save(a);
  }

  public Acontecimentos criarAcontecimento(Eventos e) {
    Acontecimentos acontecimentos = Acontecimentos
      .builder()
      .source(CURRENT_SOURCE)
      .eventoId(e.getId())
      .transacaoId(e.getId())
      .payload(e)
      .criacao(LocalDateTime.now())
      .build();
    adicionarHistoria(acontecimentos, "Saga Iniciada");
    return salvar(acontecimentos);
  }

  private void adicionarHistoria(Acontecimentos a, String message) {
        Historia
            .builder()
            .source(a.getSource())
            .status(ESagaStatus.SUCCESS)
            .status(a.getStatus())
            .message(message)
            .createdAt(LocalDateTime.now())
            .build();
    }

    public void notifyEnding(Acontecimentos a) {
        a.setSource(CURRENT_SOURCE);
        a.setEventoId(a.getPayload().getId());
        a.setCriacao(LocalDateTime.now());
        fimDaHistoria(a);
        salvar(a);
        log.info("Order {} with saga notified! TransactionId: {}", a.getEventoId(), a.getTransacaoId());
    }

    private void fimDaHistoria(Acontecimentos a) {
        if (a.getStatus().equals(ESagaStatus.SUCCESS)) {
            log.info("SAGA FINISHED SUCCESSFULLY FOR EVENT {}", a.getId());
            adicionarHistoria(a, "Saga finished successfully!");
        } else {
            log.info("SAGA FINISHED WITH ERRORS FOR EVENT {}", a.getId());
            adicionarHistoria(a, "Saga finished with errors!");
        }
    }

}

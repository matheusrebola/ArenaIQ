package arenaiq.encaminhador.evento.core.services;

import arenaiq.encaminhador.evento.core.dtos.EventoDTO;
import org.springframework.stereotype.Service;

import arenaiq.encaminhador.evento.core.models.Eventos;
import arenaiq.encaminhador.evento.core.producers.SagaProducer;
import arenaiq.encaminhador.evento.core.repositories.EventosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventosService {
  private final EventosRepository repository;
  private final SagaProducer producer;
  
  public void criarEvento(EventoDTO dto) {
    producer.enviarAcontecimento(dto);
  }

  public Eventos salvar(Eventos eventos){
    return repository.save(eventos);
  }



}

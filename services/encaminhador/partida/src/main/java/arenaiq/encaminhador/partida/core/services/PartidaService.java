package arenaiq.encaminhador.partida.core.services;

import org.springframework.stereotype.Service;

import arenaiq.encaminhador.partida.core.dtos.PartidaUpdateDTO;
import arenaiq.encaminhador.partida.core.models.Partidas;
import arenaiq.encaminhador.partida.core.repositories.PartidaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PartidaService {
  private final PartidaRepository repository;

  public Partidas salvar(Partidas p) {
    return repository.save(p);
  }

  public Partidas atualizarPartida(Partidas p, PartidaUpdateDTO dto) {
    p.getClima().add(dto.getClima());
    p.getTemperatura().add(dto.getTemperatura());
    p.getUmidade().add(dto.getUmidade());
    p.setPlacarC(dto.getPlacarC());
    p.setPlacarV(dto.getPlacarV());
    return salvar(p);
  }

  public Partidas encontrarPeloId(String id) {
    return repository.findById(id).orElse(null);
  }
}

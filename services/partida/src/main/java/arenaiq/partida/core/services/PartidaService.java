package arenaiq.partida.core.services;

import org.springframework.stereotype.Service;

import arenaiq.partida.core.models.Partida;
import arenaiq.partida.core.repositories.PartidaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PartidaService {
  private final PartidaRepository repository;

  public Partida salvar(Partida p) {
    return repository.save(p);
  }

  public void deletarPorId(String id){
    repository.deleteById(id);
  }

}

package arenaiq.partida.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.partida.core.models.Partidas;
import arenaiq.partida.core.repositories.PartidaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PartidaService {
  private final PartidaRepository repository;

  public Partidas salvar(Partidas p) {
    return repository.save(p);
  }

  public List<Partidas> encontrarTodos(){
    return repository.findAll();
  }

  public void deletarPorId(String id){
    repository.deleteById(id);
  }

  public void deletarTodos() {
    repository.deleteAll();
  }

}

package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Partidas;
import arenaiq.dadoshistoricos.core.repositories.PartidasRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PartidasService {
  private final PartidasRepository repository;

  public Partidas salvar(Partidas p) {
    return repository.save(p);
  }

  public Boolean existsById(String id) {
    return repository.existsById(id);
  }

  public void deleteById(String id){
    repository.deleteById(id);
  }

  public Partidas atualizar(Partidas p, String id) {
    deleteById(id);
    return salvar(p);
  }
}

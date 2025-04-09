package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Temporadas;
import arenaiq.dadoshistoricos.core.repositories.TemporadasRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TemporadasService {
  private final TemporadasRepository repository;

  public Temporadas salvar(Temporadas t) {
    return repository.save(t);
  }

  public Boolean existsById(String id) {
    return repository.existsById(id);
  }

  public void deleteById(String id){
    repository.deleteById(id);
  }

  public Temporadas atualizar(Temporadas t, String id) {
    deleteById(id);
    return salvar(t);
  }
}

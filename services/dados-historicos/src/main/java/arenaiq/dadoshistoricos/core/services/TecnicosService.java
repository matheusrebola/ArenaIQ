package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Tecnicos;
import arenaiq.dadoshistoricos.core.repositories.TecnicosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TecnicosService {
  private final TecnicosRepository repository;

  public Tecnicos salvar(Tecnicos t) {
    return repository.save(t);
  }

  public Boolean existsById(String id) {
    return repository.existsById(id);
  }

  public void deleteById(String id){
    repository.deleteById(id);
  }

  public Tecnicos atualizar(Tecnicos t, String id) {
    deleteById(id);
    t.setId(id);
    return salvar(t);
  }
}

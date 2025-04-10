package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Elencos;
import arenaiq.dadoshistoricos.core.repositories.ElencosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ElencosService {
  private final ElencosRepository repository;

  public Elencos salvar(Elencos e) {
    return repository.save(e);
  }

  public Boolean existsById(String id) {
    return repository.existsById(id);
  }

  public void deleteById(String id){
    repository.deleteById(id);
  }

  public Elencos atualizar(Elencos e, String id) {
    deleteById(id);
    e.setId(id);
    return salvar(e);
  }

}

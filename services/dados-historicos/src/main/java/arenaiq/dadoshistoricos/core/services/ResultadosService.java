package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.document.Resultados;
import arenaiq.dadoshistoricos.core.repositories.mongo.ResultadosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResultadosService {
  private final ResultadosRepository repository;

  public Resultados salvar(Resultados r) {
    return repository.save(r);
  }

  public Boolean existsById(String id) {
    return repository.existsById(id);
  }

  public void deleteById(String id){
    repository.deleteById(id);
  }

  public Resultados atualizar(Resultados r, String id) {
    deleteById(id);
    r.setId(id);
    return salvar(r);
  }
}

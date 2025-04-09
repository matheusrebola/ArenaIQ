package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Competicoes;
import arenaiq.dadoshistoricos.core.repositories.CompeticoesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompeticoesService {
  private final CompeticoesRepository repository;
  
  public Competicoes salvar(Competicoes c) {
    return repository.insert(c);
  }

  public Competicoes findById(String id) {
    return repository.findById(id).orElse(null);
  }

  public Boolean exists(String id){
    return repository.existsById(id);
  }

  public Competicoes atualizar(Competicoes c, String id) {
    repository.deleteById(id);
    return salvar(c);
  }

}

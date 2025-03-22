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
    return repository.save(c);
  }

}

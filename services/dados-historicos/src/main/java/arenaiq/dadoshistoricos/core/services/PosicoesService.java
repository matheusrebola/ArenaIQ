package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Posicoes;
import arenaiq.dadoshistoricos.core.repositories.PosicoesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PosicoesService {
  private final PosicoesRepository repository;

  public Posicoes salvar(Posicoes p) {
    return repository.save(p);
  }
}

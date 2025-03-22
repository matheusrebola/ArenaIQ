package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Titulos;
import arenaiq.dadoshistoricos.core.repositories.TitulosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TitulosService {
  private final TitulosRepository repository;

  public Titulos salvar(Titulos t) {
    return repository.save(t);
  }
}

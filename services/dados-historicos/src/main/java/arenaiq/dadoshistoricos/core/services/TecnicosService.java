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
}

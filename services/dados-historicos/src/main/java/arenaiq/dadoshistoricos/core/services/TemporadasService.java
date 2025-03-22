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
}

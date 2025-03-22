package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Partidas;
import arenaiq.dadoshistoricos.core.repositories.PartidasRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PartidasService {
  private final PartidasRepository repository;

  public Partidas salvar(Partidas p) {
    return repository.save(p);
  }
}

package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Jogadores;
import arenaiq.dadoshistoricos.core.repositories.JogadoresRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadoresService {
  private final JogadoresRepository repository;

  public Jogadores salvar(Jogadores j) {
    return repository.save(j);
  }

}

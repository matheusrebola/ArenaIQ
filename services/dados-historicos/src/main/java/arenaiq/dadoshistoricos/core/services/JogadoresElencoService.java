package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.JogadoresElenco;
import arenaiq.dadoshistoricos.core.repositories.JogadoresElencoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadoresElencoService {
  private final JogadoresElencoRepository repository;

  public JogadoresElenco salvar(JogadoresElenco j) {
    return repository.save(j);
  }

  
}

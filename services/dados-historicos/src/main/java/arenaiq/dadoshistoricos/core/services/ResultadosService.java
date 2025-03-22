package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Resultados;
import arenaiq.dadoshistoricos.core.repositories.ResultadosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResultadosService {
  private final ResultadosRepository repository;

  public Resultados salvar(Resultados r) {
    return repository.save(r);
  }
}

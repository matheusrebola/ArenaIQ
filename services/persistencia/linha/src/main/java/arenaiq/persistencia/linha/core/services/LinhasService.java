package arenaiq.persistencia.linha.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.persistencia.linha.core.models.Linhas;
import arenaiq.persistencia.linha.core.repositories.LinhasRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class LinhasService {
  private final LinhasRepository r;

  public List<Linhas> encontrarTodos() {
    return r.findAll();
  }

}

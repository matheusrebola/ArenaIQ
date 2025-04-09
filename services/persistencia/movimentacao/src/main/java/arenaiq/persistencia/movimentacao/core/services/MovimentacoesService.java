package arenaiq.persistencia.movimentacao.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.persistencia.movimentacao.core.models.Movimentacoes;
import arenaiq.persistencia.movimentacao.core.repositories.MovimentacoesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovimentacoesService {
  private final MovimentacoesRepository r;

  public List<Movimentacoes> encontrarTodos() {
    return r.findAll();
  }

}

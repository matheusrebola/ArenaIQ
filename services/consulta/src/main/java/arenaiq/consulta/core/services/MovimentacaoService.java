package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Movimentacoes;
import arenaiq.consulta.core.repositories.MovimentacaoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovimentacaoService {
  private final MovimentacaoRepository r;

  public List<Movimentacoes> findAll(){
    return r.findAll();
  }
  
}

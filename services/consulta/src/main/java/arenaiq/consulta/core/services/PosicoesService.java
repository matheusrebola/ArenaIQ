package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Posicoes;
import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EPosicao;
import arenaiq.consulta.core.repositories.PosicoesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PosicoesService {
  private final PosicoesRepository r;

  public List<Posicoes> findAll(){
    return r.findAll();
  }

  public List<Posicoes> findByPosicao(EPosicao p){
    return r.findByPosicao(p);
  }

  public List<Posicoes> findByFuncao(EFunPosicao f){
    return r.findByFuncao(f);
  }

  public List<Posicoes> findByDescricao(String d){
    return r.findByDescricao(d);
  }
}

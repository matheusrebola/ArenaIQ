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

  public List<Movimentacoes> findByEixoX(Float x){
    return r.findByEixoX(x);
  }

  public List<Movimentacoes> findByEixoY(Float y){
    return r.findByEixoY(y);
  }

  public List<Movimentacoes> findByVelocidade(Float v){
    return r.findByVelocidade(v);
  }

  public List<Movimentacoes> findByAceleracao(Float a){
    return r.findByAceleracao(a);
  }

  public List<Movimentacoes> findByMinuto(Byte m){
    return r.findByMinuto(m);
  }

  public List<Movimentacoes> findBySegundo(Byte s){
    return r.findBySegundo(s);
  }
  
  public List<Movimentacoes> findByPressao(Boolean p){
    return r.findByPressao(p);
  }
}

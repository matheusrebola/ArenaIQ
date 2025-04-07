package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Resultados;
import arenaiq.consulta.core.repositories.ResultadosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResultadosService {
  private final ResultadosRepository r;

  public List<Resultados> findByJogosDisputados(Byte j){
    return r.findByJogosDisputados(j);
  }

  public List<Resultados> findByVitorias(Byte v){
    return r.findByVitorias(v);
  }

  public List<Resultados> findByDerrotas(Byte d){
    return r.findByDerrotas(d);
  }

  public List<Resultados> findByEmpates(Byte e){
    return r.findByEmpates(e);
  }

  public List<Resultados> findByAproveitamento(Float a){
    return r.findByAproveitamento(a);
  }

  public List<Resultados> findByGolsMarcados(Byte m){
    return r.findByGolsMarcados(m);
  }

  public List<Resultados> findByGolsSofridos(Byte s){
    return r.findByGolsSofridos(s);
  }

  public List<Resultados> findByDesempenho(Float d){
    return r.findByDesempenho(d);
  }

  public List<Resultados> findByCompeticao(String c){
    return r.findByCompeticao(c);
  }

  public List<Resultados> findByEquipe(String t){
    return r.findByEquipe(t);
  }

  public List<Resultados> findByTemporada(String t){
    return r.findByTemporada(t);
  }

}

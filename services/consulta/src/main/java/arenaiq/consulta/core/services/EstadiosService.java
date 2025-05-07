package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Estadios;
import arenaiq.consulta.core.models.enums.EClima;
import arenaiq.consulta.core.models.enums.ECobertura;
import arenaiq.consulta.core.models.enums.EDrenagem;
import arenaiq.consulta.core.models.enums.EGrama;
import arenaiq.consulta.core.models.enums.EInclinacao;
import arenaiq.consulta.core.models.enums.EVento;
import arenaiq.consulta.core.repositories.EstadiosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstadiosService {
  private final EstadiosRepository r;
  
  public List<Estadios> findAll() {
    return r.findAll();
  }
  
  public List<Estadios> findByNome(String n){
    return r.findByNome(n);
  }

  public List<Estadios> findByCidade(String c){
    return r.findByCidade(c);
  }

  public List<Estadios> findByPais(String p){
    return r.findByPais(p);
  }

  public List<Estadios> findByClubeMandante(String c){
    return r.findByClubeMandante(c);
  }

  public List<Estadios> findByCapacidade(String c){
    return r.findByCapacidade(c);
  }

  public List<Estadios> findByGrama(EGrama g){
    return r.findByGrama(g);
  }

  public List<Estadios> findByComprimento(Byte c){
    return r.findByComprimento(c);
  }

  public List<Estadios> findByLargura(Byte l){
    return r.findByLargura(l);
  }

  public List<Estadios> findByCobertura(ECobertura c){
    return r.findByCobertura(c);
  }

  public List<Estadios> findByDrenagem(EDrenagem d){
    return r.findByDrenagem(d);
  }

  public List<Estadios> findByInclinacao(EInclinacao i){
    return r.findByInclinacao(i);
  }

  public List<Estadios> findByVento(EVento v){
    return r.findByVento(v);
  }

  public List<Estadios> findByClima(EClima c){
    return r.findByClima(c);
  }

  public List<Estadios> findByUltimoReparo(String u){
    return r.findByUltimoReparo(u);
  }

  public List<Estadios> findByObservacoes(String o){
    return r.findByObservacoes(o);
  }

}

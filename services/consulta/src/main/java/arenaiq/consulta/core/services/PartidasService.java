package arenaiq.consulta.core.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Partidas;
import arenaiq.consulta.core.repositories.PartidasRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PartidasService {
  private final PartidasRepository r;

  public List<Partidas> findByDataHora(LocalDateTime d){
    return r.findByDataHora(d);
  }

  public List<Partidas> findByLocal(String l){
    return r.findByLocal(l);
  }

  public List<Partidas> findByCasa(String c){
    return r.findByCasa(c);
  }

  public List<Partidas> findByVisitante(String v){
    return r.findByVisitante(v);
  }

  public List<Partidas> findByPlacarC(Byte c){
    return r.findByPlacarC(c);
  }

  public List<Partidas> findByPlacarV(Byte v){
    return r.findByPlacarV(v);
  }

  public List<Partidas> findByCompeticao(String c){
    return r.findByCompeticao(c);
  }
}

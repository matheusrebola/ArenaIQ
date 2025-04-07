package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Temporadas;
import arenaiq.consulta.core.repositories.TemporadasRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TemporadasService {
  private final TemporadasRepository r;

  public List<Temporadas> findAll(){
    return r.findAll();
  }

  public List<Temporadas> findByTemporada(String t){
    return r.findByTemporada(t);
  }

  public List<Temporadas> findByDataInicio(String i){
    return r.findByDataInicio(i);
  }

  public List<Temporadas> findByDataFim(String f){
    return r.findByDataFim(f);
  }
}

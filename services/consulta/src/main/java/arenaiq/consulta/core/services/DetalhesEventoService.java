package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.DetalhesEvento;
import arenaiq.consulta.core.repositories.DetalhesEventoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DetalhesEventoService {
  private final DetalhesEventoRepository r;

  public List<DetalhesEvento> findAll(){
    return r.findAll();
  }

  public List<DetalhesEvento> findByRPrimario(String p){
    return r.findByRPrimario(p);
  }

  public List<DetalhesEvento> findByRSecundario(String s){
    return r.findByRSecundario(s);
  }

  public List<DetalhesEvento> findByDistancia(Float d){
    return r.findByDistancia(d);
  }

  public List<DetalhesEvento> findByPressaoAdversaria(Boolean p){
    return r.findByPressaoAdversaria(p);
  }

  public List<DetalhesEvento> findByNivelPressao(Float n){
    return r.findByNivelPressao(n);
  }
}

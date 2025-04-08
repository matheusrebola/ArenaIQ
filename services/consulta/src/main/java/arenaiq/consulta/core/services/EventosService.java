package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Eventos;
import arenaiq.consulta.core.models.enums.EEvento;
import arenaiq.consulta.core.models.enums.EMotivo;
import arenaiq.consulta.core.repositories.EventosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventosService {
  private final EventosRepository r;

  List<Eventos> findByEvento(EEvento e){
    return r.findByEvento(e);
  }

  List<Eventos> findByMotivo(EMotivo m){
    return r.findByMotivo(m);
  }

  List<Eventos> findByPartida(String p){
    return r.findByPartida(p);
  }

  List<Eventos> findByOrigem(String o){
    return r.findByOrigem(o);
  }

  List<Eventos> findByDestino(String d){
    return r.findByDestino(d);
  }

  List<Eventos> findByMinuto(Byte m){
    return r.findByMinuto(m);
  }

  List<Eventos> findBySegundo(Byte s){
    return r.findBySegundo(s);
  }

  List<Eventos> findByPosicaoX(String x){
    return r.findByPosicaoX(x);
  }

  List<Eventos> findByPosicaoY(String y){
    return r.findByPosicaoY(y);
  }

  List<Eventos> findByDistancia(Float d){
    return r.findByDistancia(d);
  }
}

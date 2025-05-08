package arenaiq.persistencia.evento.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.persistencia.evento.core.models.Eventos;
import arenaiq.persistencia.evento.core.repositories.EventosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventosService {
  private final EventosRepository r;

  public List<Eventos> encontrarTodos(){
    return r.findAll();
  }

  public Eventos salvar(Eventos e) {
    return r.save(e);
  }
}

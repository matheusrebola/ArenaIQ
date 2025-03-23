package arenaiq.encaminhador.evento.core.services;

import org.springframework.stereotype.Service;

import arenaiq.encaminhador.evento.core.models.Eventos;
import arenaiq.encaminhador.evento.core.producers.SagaProducer;
import arenaiq.encaminhador.evento.core.repositories.EventosRepository;
import arenaiq.encaminhador.evento.core.utils.JsonUtil;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventosService {
  private final EventosRepository repository;
  private final SagaProducer producer;
  private final JsonUtil jsonUtil;
  private final AcontecimentosService service;
  
  public Eventos criarEvento(Eventos e) {
    Eventos s = repository.save(e);
    producer.enviarAcontecimento(jsonUtil.toJson(service.criarAcontecimento(e)));
    return s;
  }

}

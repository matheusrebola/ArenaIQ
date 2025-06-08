package arenaiq.encaminhador.evento.core.mappers;

import arenaiq.encaminhador.evento.core.dtos.ResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.encaminhador.evento.core.dtos.EventoDTO;
import arenaiq.encaminhador.evento.core.models.Eventos;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class EventosMapper {

  private final ModelMapper mapper;

  public Eventos map(EventoDTO evento) {
    return mapper.map(evento, Eventos.class);
  }

  public EventoDTO map(Eventos e) {
    return mapper.map(e, EventoDTO.class);
  }

  public ResponseDTO map(){
    return ResponseDTO.builder()
            .id(UUID.randomUUID())
            .data(LocalDateTime.now())
            .build();
  }

}

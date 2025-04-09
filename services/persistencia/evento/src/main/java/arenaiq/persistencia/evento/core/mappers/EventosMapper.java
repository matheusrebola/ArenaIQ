package arenaiq.persistencia.evento.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.persistencia.evento.core.dtos.EventosDTO;
import arenaiq.persistencia.evento.core.models.Eventos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EventosMapper {
  private final ModelMapper m;

  public List<EventosDTO> map(List<Eventos> e) {
    return e.stream()
            .map(dto ->{
              EventosDTO eventos = m.map(dto, EventosDTO.class);
              return eventos;
            })  
            .collect(Collectors.toList());
  }

}

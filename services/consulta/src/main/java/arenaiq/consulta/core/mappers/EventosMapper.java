package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.EventosDTO;
import arenaiq.consulta.core.models.Eventos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EventosMapper {
  private final ModelMapper m;

  public List<EventosDTO> map(List<Eventos> e){
    return e.stream()
            .map(ev -> {
              EventosDTO dto = m.map(ev, EventosDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

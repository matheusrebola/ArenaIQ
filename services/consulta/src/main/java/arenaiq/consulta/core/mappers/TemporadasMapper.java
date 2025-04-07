package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.TemporadasDTO;
import arenaiq.consulta.core.models.Temporadas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TemporadasMapper {
  private final ModelMapper m;

  public List<TemporadasDTO> map(List<Temporadas> t){
    return t.stream()
            .map(tem -> {
              TemporadasDTO dto = m.map(tem, TemporadasDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.EstadiosDTO;
import arenaiq.consulta.core.models.Estadios;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EstadiosMapper {
  private final ModelMapper m;

  public List<EstadiosDTO> map(List<Estadios> e) {
    return e.stream()
            .map(dto -> {
              EstadiosDTO estadio = m.map(dto, EstadiosDTO.class);
              return estadio;
            })
            .collect(Collectors.toList());
  }
}

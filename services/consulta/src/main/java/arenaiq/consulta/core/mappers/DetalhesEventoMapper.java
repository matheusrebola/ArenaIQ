package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.DetalhesEventoDTO;
import arenaiq.consulta.core.models.DetalhesEvento;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DetalhesEventoMapper {
  private final ModelMapper m;

  public List<DetalhesEventoDTO> map(List<DetalhesEvento> d){
    return d.stream()
            .map(det -> {
              DetalhesEventoDTO dto = m.map(det, DetalhesEventoDTO.class);
              return dto;})
            .collect(Collectors.toList());
  }
}

package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.LinhasDTO;
import arenaiq.consulta.core.models.Linhas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class LinhasMapper {
  private final ModelMapper m;

  public List<LinhasDTO> map(List<Linhas> l){
    return l.stream()
            .map(lin -> {
              LinhasDTO dto = m.map(lin, LinhasDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

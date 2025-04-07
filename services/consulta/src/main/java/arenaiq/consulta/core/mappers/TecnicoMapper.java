package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.TecnicosDTO;
import arenaiq.consulta.core.models.Tecnicos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TecnicoMapper {
  private final ModelMapper m;

  public List<TecnicosDTO> map(List<Tecnicos> t){
    return t.stream()
            .map(tec -> {
              TecnicosDTO dto = m.map(tec, TecnicosDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

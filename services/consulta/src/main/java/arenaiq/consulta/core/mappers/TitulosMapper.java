package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.TitulosDTO;
import arenaiq.consulta.core.models.Titulos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TitulosMapper {
  private final ModelMapper m;

  public List<TitulosDTO> map(List<Titulos> t){
    return t.stream()
            .map(ti -> {
              TitulosDTO dto = m.map(ti, TitulosDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

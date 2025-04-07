package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.ElencosDTO;
import arenaiq.consulta.core.models.Elencos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ElencosMapper {
  private final ModelMapper m;

  public List<ElencosDTO> map(List<Elencos> e){
    return e.stream()
            .map(ele -> {
              ElencosDTO dto = m.map(ele, ElencosDTO.class);
              return dto;})
            .collect(Collectors.toList());
  }
}

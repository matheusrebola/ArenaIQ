package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.EquipesDTO;
import arenaiq.consulta.core.models.Equipes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EquipesMapper {
  private final ModelMapper m;

  public List<EquipesDTO> map(List<Equipes> e){
    return e.stream()
            .map(eq -> {
              EquipesDTO dto = m.map(eq, EquipesDTO.class);
              return dto;})
            .collect(Collectors.toList());
  }
}

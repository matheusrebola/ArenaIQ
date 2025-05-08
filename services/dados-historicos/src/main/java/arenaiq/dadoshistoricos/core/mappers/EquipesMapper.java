package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.EquipesCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.EquipesDTO;
import arenaiq.dadoshistoricos.core.models.document.Equipes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EquipesMapper {
  private final ModelMapper mapper;

  public Equipes map(EquipesCreateDTO dto) {
    return mapper.map(dto, Equipes.class);
  }

  public EquipesDTO map(Equipes e) {
    return mapper.map(e, EquipesDTO.class);
  }

  public Equipes map(EquipesDTO e) {
    return mapper.map(e, Equipes.class);
  }
}

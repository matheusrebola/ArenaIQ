package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.EquipesDTO;
import arenaiq.consulta.core.models.Equipes;

@Component
public class EquipesMapper {

  public List<EquipesDTO> map(List<Equipes> e){
    return e.stream().map(eq -> map(eq)).collect(Collectors.toList());
  }

  public EquipesDTO map(Equipes e){
    return EquipesDTO.builder()
                      .id(e.getId())
                      .nome(e.getNome())
                      .cidade(e.getCidade())
                      .pais(e.getPais())
                      .anoFundacao(e.getAnoFundacao())
                      .build();
  }
}

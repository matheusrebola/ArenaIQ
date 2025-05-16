package arenaiq.dadoshistoricos.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.EquipesDTO;
import arenaiq.dadoshistoricos.core.models.Equipes;

@Component
public class EquipesMapper {
  public Equipes map(EquipesDTO e) {
    return Equipes.builder()
      .nome(e.getNome())
      .cidade(e.getCidade())
      .pais(e.getPais())
      .anoFundacao(e.getAnoFundacao())
      .build();
  }
}

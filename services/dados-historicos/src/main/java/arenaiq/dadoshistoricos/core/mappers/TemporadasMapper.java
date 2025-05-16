package arenaiq.dadoshistoricos.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.TemporadasDTO;
import arenaiq.dadoshistoricos.core.models.Temporadas;

@Component
public class TemporadasMapper {
  public Temporadas map(TemporadasDTO t) {
    return Temporadas.builder()
      .temporada(t.getTemporada())
      .dataInicio(t.getDataInicio())
      .dataFim(t.getDataFim())
      .build();
  }
}

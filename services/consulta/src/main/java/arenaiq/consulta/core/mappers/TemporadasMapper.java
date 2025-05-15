package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.TemporadasDTO;
import arenaiq.consulta.core.models.Temporadas;

@Component
public class TemporadasMapper {

  public List<TemporadasDTO> map(List<Temporadas> t){
    return t.stream().map(tem -> map(tem)).collect(Collectors.toList());
  }

  public TemporadasDTO map(Temporadas t){
    return TemporadasDTO.builder()
                        .id(t.getId())
                        .temporada(t.getTemporada())
                        .dataInicio(t.getDataInicio())
                        .dataFim(t.getDataFim())
                        .build();
  }
}

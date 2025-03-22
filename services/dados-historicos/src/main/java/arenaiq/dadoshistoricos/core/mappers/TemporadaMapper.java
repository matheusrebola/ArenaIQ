package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.TemporadasCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.TemporadasDTO;
import arenaiq.dadoshistoricos.core.models.Temporadas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TemporadaMapper {
  private final ModelMapper mapper;

  public Temporadas map(TemporadasCreateDTO dto) {
    return mapper.map(dto, Temporadas.class);
  }

  public TemporadasDTO map(Temporadas t) {
    return mapper.map(t, TemporadasDTO.class);
  }
}

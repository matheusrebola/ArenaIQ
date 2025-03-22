package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.PartidasCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.PartidasDTO;
import arenaiq.dadoshistoricos.core.models.Partidas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PartidaMapper {
  private final ModelMapper mapper;

  public Partidas map(PartidasCreateDTO dto) {
    return mapper.map(dto, Partidas.class);
  }

  public PartidasDTO map(Partidas p) {
    return mapper.map(p, PartidasDTO.class);
  }
}

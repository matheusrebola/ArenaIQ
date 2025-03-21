package arenaiq.partida.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.partida.core.dtos.PartidaCreateDTO;
import arenaiq.partida.core.dtos.PartidaDTO;
import arenaiq.partida.core.models.Partida;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PartidaMapper {
  private final ModelMapper mapper;

  public Partida map(PartidaCreateDTO requestDTO) {
    return mapper.map(requestDTO, Partida.class);
  }

  public PartidaDTO map(Partida p) {
    return mapper.map(p, PartidaDTO.class);
  }
}

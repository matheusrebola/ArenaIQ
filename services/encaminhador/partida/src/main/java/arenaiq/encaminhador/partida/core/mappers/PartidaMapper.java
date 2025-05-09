package arenaiq.encaminhador.partida.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.encaminhador.partida.core.dtos.PartidasDTO;
import arenaiq.encaminhador.partida.core.models.Partidas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PartidaMapper {
  private final ModelMapper mapper;
  
  public PartidasDTO map(Partidas p) {
    return mapper.map(p, PartidasDTO.class);
  }

}

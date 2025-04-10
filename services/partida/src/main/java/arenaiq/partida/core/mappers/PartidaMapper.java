package arenaiq.partida.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.partida.core.dtos.JogadoresDTO;
import arenaiq.partida.core.dtos.PartidasCreateDTO;
import arenaiq.partida.core.dtos.PartidasDTO;
import arenaiq.partida.core.dtos.PartidaDTO;
import arenaiq.partida.core.models.Partidas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PartidaMapper {
  private final ModelMapper mapper;

  public Partidas map(PartidasCreateDTO p) {
    return mapper.map(p, Partidas.class);
  }

  public PartidaDTO map(Partidas p, List<JogadoresDTO> j) {
    PartidaDTO dto = mapper.map(p, PartidaDTO.class);
    dto.setJogadores(j);
    return dto;
  }

  public List<PartidasDTO> map(List<Partidas> p){
    return p.stream()
            .map(dto -> {
              PartidasDTO partida = mapper.map(dto, PartidasDTO.class);
              return partida;
            })
            .collect(Collectors.toList());
  }
}

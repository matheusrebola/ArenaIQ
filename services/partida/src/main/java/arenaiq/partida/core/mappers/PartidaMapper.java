package arenaiq.partida.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.partida.core.dtos.JogadoresDTO;
import arenaiq.partida.core.dtos.PartidaCreateDTO;
import arenaiq.partida.core.dtos.PartidaDTO;
import arenaiq.partida.core.models.Partida;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PartidaMapper {
  private final ModelMapper mapper;

  public Partida map(PartidaCreateDTO p) {
    return mapper.map(p, Partida.class);
  }

  public PartidaDTO map(Partida p, List<JogadoresDTO> j) {
    PartidaDTO dto = mapper.map(p, PartidaDTO.class);
    dto.setJogadores(j);
    return dto;
  }

  public List<PartidaDTO> map(List<Partida> p){
    return p.stream()
            .map(dto -> {
              PartidaDTO partida = mapper.map(dto, PartidaDTO.class);
              return partida;
            })
            .collect(Collectors.toList());
  }
}

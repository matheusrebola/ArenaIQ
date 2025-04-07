package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.PartidasDTO;
import arenaiq.consulta.core.models.Partidas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PartidaMapper {
  private final ModelMapper m;

  public List<PartidasDTO> map(List<Partidas> p){
    return p.stream()
            .map(par -> {
              PartidasDTO dto = m.map(par, PartidasDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

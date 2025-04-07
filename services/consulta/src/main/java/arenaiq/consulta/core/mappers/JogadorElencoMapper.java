package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.JogadoresElencoDTO;
import arenaiq.consulta.core.models.JogadoresElenco;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JogadorElencoMapper {
  private final ModelMapper m;

  public List<JogadoresElencoDTO> map(List<JogadoresElenco> j){
    return j.stream()
            .map(je -> {
              JogadoresElencoDTO dto = m.map(je, JogadoresElencoDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

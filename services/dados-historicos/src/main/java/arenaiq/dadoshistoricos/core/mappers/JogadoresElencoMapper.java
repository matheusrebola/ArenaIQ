package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.JogadoresElencoCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.JogadoresElencoDTO;
import arenaiq.dadoshistoricos.core.models.JogadoresElenco;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JogadoresElencoMapper {
  private final ModelMapper mapper;

  public JogadoresElenco map(JogadoresElencoCreateDTO dto) {
    return mapper.map(dto, JogadoresElenco.class);
  }

  public JogadoresElencoDTO map(JogadoresElenco e) {
    return mapper.map(e, JogadoresElencoDTO.class);
  }

  public JogadoresElenco map(JogadoresElencoDTO j) {
    return mapper.map(j, JogadoresElenco.class);
  }
}

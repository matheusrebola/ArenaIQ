package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.JogadoresCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.JogadoresDTO;
import arenaiq.dadoshistoricos.core.models.document.Jogadores;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JogadoresMapper {
  private final ModelMapper mapper;
  
  public Jogadores map(JogadoresCreateDTO dto) {
    return mapper.map(dto, Jogadores.class);
  }

  public JogadoresDTO map(Jogadores j) {
    return mapper.map(j, JogadoresDTO.class);
  }

  public Jogadores map(JogadoresDTO j) {
    return mapper.map(j, Jogadores.class);
  }
}

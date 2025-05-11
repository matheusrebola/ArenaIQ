package arenaiq.partida.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.partida.core.dtos.JogadoresDTO;
import arenaiq.partida.core.models.Jogadores;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JogadorMapper {
  private final ModelMapper mapper;
  
  public List<JogadoresDTO> map(List<Jogadores> j, String c) {
    return j.stream()
            .map(jog ->{
              JogadoresDTO dto = mapper.map(jog, JogadoresDTO.class);
              dto.setClube(c);
              return dto;
            })
            .collect(Collectors.toList());
  }

}

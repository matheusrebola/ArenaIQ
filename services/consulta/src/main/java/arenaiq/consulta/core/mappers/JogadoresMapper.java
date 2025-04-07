package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.JogadoresDTO;
import arenaiq.consulta.core.models.Jogadores;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JogadoresMapper {
  private final ModelMapper m;

  public List<JogadoresDTO> map(List<Jogadores> j){
    return j.stream()
            .map(jog -> {
              JogadoresDTO dto = m.map(jog, JogadoresDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }

  public JogadoresDTO map(Jogadores j){
    return m.map(j, JogadoresDTO.class);
  }
}

package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.CompeticoesDTO;
import arenaiq.consulta.core.models.Competicoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CompeticoesMapper {
  private final ModelMapper m;

  public List<CompeticoesDTO> map(List<Competicoes> c){
    return c.stream()
            .map(comp -> {
              CompeticoesDTO dto = m.map(comp, CompeticoesDTO.class);
              return dto;})
              .collect(Collectors.toList());
            
  }
}

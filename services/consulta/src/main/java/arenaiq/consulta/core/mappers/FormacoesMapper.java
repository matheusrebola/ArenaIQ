package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.FormacoesDTO;
import arenaiq.consulta.core.models.Formacoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FormacoesMapper {
  private final ModelMapper m;

  public List<FormacoesDTO> map(List<Formacoes> f){
    return f.stream()
            .map(form -> {
              FormacoesDTO dto = m.map(form, FormacoesDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

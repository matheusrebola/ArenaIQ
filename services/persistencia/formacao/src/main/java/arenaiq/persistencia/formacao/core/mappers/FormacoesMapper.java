package arenaiq.persistencia.formacao.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.persistencia.formacao.core.dtos.FormacoesDTO;
import arenaiq.persistencia.formacao.core.models.Formacoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FormacoesMapper {
  private final ModelMapper m;
  
  public List<FormacoesDTO> map(List<Formacoes> f) {
    return f.stream()
            .map(dto -> {
              FormacoesDTO formacoes = m.map(dto, FormacoesDTO.class);
              return formacoes;
            })
            .collect(Collectors.toList());
  }
  
}

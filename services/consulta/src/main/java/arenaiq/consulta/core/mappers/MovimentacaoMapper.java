package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.MovimentacoesDTO;
import arenaiq.consulta.core.models.Movimentacoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MovimentacaoMapper {
  private final ModelMapper mapper;

  public List<MovimentacoesDTO> map(List<Movimentacoes> m){
    return m.stream()
            .map(mov -> {
              MovimentacoesDTO dto = mapper.map(mov, MovimentacoesDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

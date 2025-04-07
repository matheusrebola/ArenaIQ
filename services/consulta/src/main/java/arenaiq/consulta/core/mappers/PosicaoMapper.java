package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.PosicoesDTO;
import arenaiq.consulta.core.models.Posicoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PosicaoMapper {
  private final ModelMapper m;

  public List<PosicoesDTO> map(List<Posicoes> p){
    return p.stream()
            .map(pos -> {
              PosicoesDTO dto = m.map(pos, PosicoesDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

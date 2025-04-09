package arenaiq.persistencia.movimentacao.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.persistencia.movimentacao.core.dtos.MovimentacoesDTO;
import arenaiq.persistencia.movimentacao.core.models.Movimentacoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MovimentacoesMapper {
  private final ModelMapper m;

  public List<MovimentacoesDTO> map(List<Movimentacoes> mov) {
    return mov.stream()
              .map(dto -> {
                MovimentacoesDTO movi = m.map(dto, MovimentacoesDTO.class);
                return movi;
              })
              .collect(Collectors.toList());
  }

}

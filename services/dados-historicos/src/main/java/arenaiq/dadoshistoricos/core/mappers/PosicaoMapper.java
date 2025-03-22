package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.PosicoesCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.PosicoesDTO;
import arenaiq.dadoshistoricos.core.models.Posicoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PosicaoMapper {
  private final ModelMapper mapper;

  public Posicoes map(PosicoesCreateDTO dto) {
    return mapper.map(dto, Posicoes.class);
  }

  public PosicoesDTO map(Posicoes p) {
    return mapper.map(p, PosicoesDTO.class);
  }
}

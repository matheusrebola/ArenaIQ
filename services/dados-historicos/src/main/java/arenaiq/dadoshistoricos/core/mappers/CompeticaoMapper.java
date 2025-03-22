package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.CompeticoesCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.CompeticoesDTO;
import arenaiq.dadoshistoricos.core.models.Competicoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CompeticaoMapper {
  private final ModelMapper mapper;

  public Competicoes map(CompeticoesCreateDTO request) {
    return mapper.map(request, Competicoes.class);
  }

  public CompeticoesDTO map(Competicoes c) {
    return mapper.map(c, CompeticoesDTO.class);
  }
}

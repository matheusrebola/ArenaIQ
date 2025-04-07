package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.TitulosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.TitulosDTO;
import arenaiq.dadoshistoricos.core.models.Titulos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TitulosMapper {
  private final ModelMapper mapper;

  public Titulos map(TitulosCreateDTO dto) {
    return mapper.map(dto, Titulos.class);
  }

  public TitulosDTO map(Titulos t) {
    return mapper.map(t, TitulosDTO.class);
  }
}

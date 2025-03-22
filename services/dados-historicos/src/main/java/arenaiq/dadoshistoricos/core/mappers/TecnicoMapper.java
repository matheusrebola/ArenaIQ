package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.TecnicosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.TecnicosDTO;
import arenaiq.dadoshistoricos.core.models.Tecnicos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TecnicoMapper {
  private final ModelMapper mapper;

  public Tecnicos map(TecnicosCreateDTO dto) {
    return mapper.map(dto, Tecnicos.class);
  }

  public TecnicosDTO map(Tecnicos t) {
    return mapper.map(t, TecnicosDTO.class);
  }
}

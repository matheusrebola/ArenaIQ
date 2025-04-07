package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.ElencosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.ElencosDTO;
import arenaiq.dadoshistoricos.core.models.Elencos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ElencosMapper {
  private final ModelMapper mapper;

  public Elencos map(ElencosCreateDTO dto) {
    return mapper.map(dto, Elencos.class);
  }

  public ElencosDTO map(Elencos e) {
    return mapper.map(e, ElencosDTO.class);
  }
}

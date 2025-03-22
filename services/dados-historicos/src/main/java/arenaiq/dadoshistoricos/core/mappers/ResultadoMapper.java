package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.ResultadosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.ResultadosDTO;
import arenaiq.dadoshistoricos.core.models.Resultados;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ResultadoMapper {
  private final ModelMapper mapper;

  public Resultados map(ResultadosCreateDTO dto) {
    return mapper.map(dto, Resultados.class);
  }

  public ResultadosDTO map(Resultados r) {
    return mapper.map(r, ResultadosDTO.class);
  }
}

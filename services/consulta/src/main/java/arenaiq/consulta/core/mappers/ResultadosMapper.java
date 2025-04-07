package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.ResultadosDTO;
import arenaiq.consulta.core.models.Resultados;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ResultadosMapper {
  private final ModelMapper m;

  public List<ResultadosDTO> map(List<Resultados> r){
    return r.stream()
            .map(res -> {
              ResultadosDTO dto = m.map(res, ResultadosDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

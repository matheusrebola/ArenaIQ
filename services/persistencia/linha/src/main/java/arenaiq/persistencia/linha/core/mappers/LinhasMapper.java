package arenaiq.persistencia.linha.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.persistencia.linha.core.dtos.LinhasDTO;
import arenaiq.persistencia.linha.core.models.Linhas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class LinhasMapper {
  private final ModelMapper m;

  public List<LinhasDTO> map(List<Linhas> l) {
    return l.stream()
            .map(dto -> {
              LinhasDTO linha = m.map(dto, LinhasDTO.class);
              return linha;
            })
            .collect(Collectors.toList());
  }

}

package arenaiq.consulta.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TituloMapper {
  private final ModelMapper mapper;
}

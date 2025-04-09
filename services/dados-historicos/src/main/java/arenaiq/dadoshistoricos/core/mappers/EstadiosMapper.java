package arenaiq.dadoshistoricos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.EstadiosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.EstadiosDTO;
import arenaiq.dadoshistoricos.core.models.Estadios;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EstadiosMapper {
  private final ModelMapper m;

  public Estadios map(EstadiosCreateDTO e){
    return m.map(e, Estadios.class);
  }

  public EstadiosDTO map(Estadios e){
    return m.map(e, EstadiosDTO.class);
  }
}

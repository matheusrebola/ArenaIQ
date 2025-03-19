package arenaiq.treino.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.treino.core.dtos.EventosCreateDTO;
import arenaiq.treino.core.dtos.EventosDTO;
import arenaiq.treino.core.dtos.FormacoesCreateDTO;
import arenaiq.treino.core.dtos.FormacoesDTO;
import arenaiq.treino.core.dtos.LinhaDefensivaCreateDTO;
import arenaiq.treino.core.dtos.LinhaDefensivaDTO;
import arenaiq.treino.core.models.Eventos;
import arenaiq.treino.core.models.Formacoes;
import arenaiq.treino.core.models.LinhaDefensiva;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TreinoMapper {
  private final ModelMapper mapper;

  public Formacoes map(FormacoesCreateDTO dto) {
    return mapper.map(dto, Formacoes.class);
  }

  public Eventos map(EventosCreateDTO dto) {
    return mapper.map(dto, Eventos.class);
  }

  public LinhaDefensiva map(LinhaDefensivaCreateDTO dto) {
    return mapper.map(dto, LinhaDefensiva.class);
  }

  public FormacoesDTO map(Formacoes f){
    return mapper.map(f, FormacoesDTO.class);
  }

  public EventosDTO map(Eventos e){
    return mapper.map(e, EventosDTO.class);
  }
  
  public LinhaDefensivaDTO map(LinhaDefensiva l){
    return mapper.map(l, LinhaDefensivaDTO.class);
  }
}

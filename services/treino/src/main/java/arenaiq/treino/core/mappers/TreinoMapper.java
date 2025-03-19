package arenaiq.treino.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.treino.core.dtos.EventosDTO;
import arenaiq.treino.core.dtos.FormacoesDTO;
import arenaiq.treino.core.dtos.LinhaDefensivaDTO;
import arenaiq.treino.core.models.Eventos;
import arenaiq.treino.core.models.Formacoes;
import arenaiq.treino.core.models.LinhaDefensiva;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TreinoMapper {
  private final ModelMapper mapper;

  public Formacoes map(FormacoesDTO requestDTO) {
    return mapper.map(requestDTO, Formacoes.class);
  }

  public Eventos map(EventosDTO requestDTO) {
    return mapper.map(requestDTO, Eventos.class);
  }

  public LinhaDefensiva map(LinhaDefensivaDTO requestDTO) {
    return mapper.map(requestDTO, LinhaDefensiva.class);
  }
  
}

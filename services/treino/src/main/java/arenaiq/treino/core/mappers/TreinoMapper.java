package arenaiq.treino.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.treino.core.dtos.EventosCreateDTO;
import arenaiq.treino.core.dtos.EventosDTO;
import arenaiq.treino.core.dtos.FormacoesCreateDTO;
import arenaiq.treino.core.dtos.FormacoesDTO;
import arenaiq.treino.core.dtos.LinhasCreateDTO;
import arenaiq.treino.core.dtos.LinhasDTO;
import arenaiq.treino.core.dtos.MovimentacoesCreateDTO;
import arenaiq.treino.core.dtos.MovimentacoesDTO;
import arenaiq.treino.core.models.Eventos;
import arenaiq.treino.core.models.Formacoes;
import arenaiq.treino.core.models.Linhas;
import arenaiq.treino.core.models.Movimentacoes;
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

  public Linhas map(LinhasCreateDTO dto) {
    return mapper.map(dto, Linhas.class);
  }

  public FormacoesDTO map(Formacoes f){
    return mapper.map(f, FormacoesDTO.class);
  }

  public EventosDTO map(Eventos e){
    return mapper.map(e, EventosDTO.class);
  }
  
  public LinhasDTO map(Linhas l){
    return mapper.map(l, LinhasDTO.class);
  }

  public Movimentacoes map(MovimentacoesCreateDTO m) {
    return mapper.map(m, Movimentacoes.class);
  }

  public MovimentacoesDTO map(Movimentacoes m) {
    return mapper.map(m, MovimentacoesDTO.class);
  }

  public List<MovimentacoesDTO> mapMoimentacoes(List<Movimentacoes> m) {
    return m.stream()
            .map(movi -> {
              MovimentacoesDTO dto = mapper.map(movi, MovimentacoesDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }

  public List<EventosDTO> mapEventos(List<Eventos> e) {
    return e.stream()
            .map(eventos -> {
              EventosDTO dto = mapper.map(eventos, EventosDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }

  public List<FormacoesDTO> mapFormacoes(List<Formacoes> f) {
    return f.stream()
            .map(form -> {
              FormacoesDTO dto = mapper.map(form, FormacoesDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }

  public List<LinhasDTO> mapLinhas(List<Linhas> l) {
    return l.stream()
            .map(linhas -> {
              LinhasDTO dto = mapper.map(linhas, LinhasDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }
}

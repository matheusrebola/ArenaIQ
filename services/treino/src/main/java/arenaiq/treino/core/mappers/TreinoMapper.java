package arenaiq.treino.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

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

@Component
public class TreinoMapper {

  public Formacoes map(FormacoesCreateDTO dto) {
    return Formacoes.builder()
            .formacao(dto.getFormacao())
            .modo(dto.getModo())
            .compacatacao(dto.getCompacatacao())
            .url(dto.getUrl())
            .build();
  }

  public Eventos map(EventosCreateDTO dto) {
    return Eventos.builder()
                  .evento(dto.getEvento())
                  .motivo(dto.getMotivo())
                  .qualidade(dto.getQualidade())
                  .ator(dto.getAtor())
                  .receptor(dto.getReceptor())
                  .url(dto.getUrl())
                  .build();
  }

  public Linhas map(LinhasCreateDTO dto) {
    return Linhas.builder()
                  .linha(dto.getLinha())
                  .altura(dto.getAltura())
                  .largura(dto.getLargura())
                  .url(dto.getUrl())
                  .build();
  }

  public FormacoesDTO map(Formacoes f){
    return FormacoesDTO.builder()
                        .id(f.getId())
                        .formacao(f.getFormacao())
                        .modo(f.getModo())
                        .compacatacao(f.getCompacatacao())
                        .url(f.getUrl())
                        .build();
  }

  public EventosDTO map(Eventos e){
    return EventosDTO.builder()
                      .id(e.getId())
                      .motivo(e.getMotivo())
                      .ator(e.getAtor())
                      .receptor(e.getReceptor())
                      .url(e.getUrl())
                      .build();
  }
  
  public LinhasDTO map(Linhas l){
    return LinhasDTO.builder()
                    .id(l.getId())
                    .altura(l.getAltura())
                    .largura(l.getLargura())
                    .url(l.getUrl())
                    .build();
  }

  public Movimentacoes map(MovimentacoesCreateDTO m) {
    return Movimentacoes.builder()
                        .inicial(m.getInicial())
                        .atual(m.getAtual())
                        .formacao(m.getFormacao())
                        .url(m.getUrl())
                        .build();
  }

  public MovimentacoesDTO map(Movimentacoes m) {
    return MovimentacoesDTO.builder()
                            .id(m.getId())
                            .inicial(m.getInicial())
                            .atual(m.getAtual())
                            .formacao(m.getFormacao())
                            .url(m.getUrl())
                            .build();
  }

  public List<MovimentacoesDTO> mapMoimentacoes(List<Movimentacoes> m) {
    return m.stream().map(movi -> map(movi))
            .collect(Collectors.toList());
  }

  public List<EventosDTO> mapEventos(List<Eventos> e) {
    return e.stream().map(eventos -> map(eventos))
            .collect(Collectors.toList());
  }

  public List<FormacoesDTO> mapFormacoes(List<Formacoes> f) {
    return f.stream().map(form -> map(form))
            .collect(Collectors.toList());
  }

  public List<LinhasDTO> mapLinhas(List<Linhas> l) {
    return l.stream().map(linhas -> map(linhas))
            .collect(Collectors.toList());
  }
}

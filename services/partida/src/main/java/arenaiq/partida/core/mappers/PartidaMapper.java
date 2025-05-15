package arenaiq.partida.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.partida.core.dtos.JogadoresDTO;
import arenaiq.partida.core.dtos.PartidaDTO;
import arenaiq.partida.core.dtos.PartidasCreateDTO;
import arenaiq.partida.core.dtos.PartidasDTO;
import arenaiq.partida.core.models.Partidas;

@Component
public class PartidaMapper {

  public Partidas map(PartidasCreateDTO p) {
    return Partidas.builder()
            .partida(p.getPartida())
            .dataHora(p.getDataHora())
            .local(p.getLocal())
            .casa(p.getCasa())
            .visitante(p.getVisitante())
            .temporada(p.getTemporada())
            .competicao(p.getCompeticao())
            .build();
  }

  public List<PartidasDTO> map(List<Partidas> p){
    return p.stream().map(part -> map(part)).collect(Collectors.toList());
  }

  public PartidasDTO map(Partidas p) {
    return PartidasDTO.builder()
              .partida(p.getPartida())
              .dataHora(p.getDataHora())
              .local(p.getLocal())
              .casa(p.getCasa())
              .visitante(p.getVisitante())
              .temporada(p.getTemporada())
              .competicao(p.getCompeticao())
              .url(p.getUrl())
              .build();
  }

  public PartidaDTO map(Partidas p, List<JogadoresDTO> j) {
    return PartidaDTO.builder()
              .id(p.getId())
              .local(p.getLocal())
              .casa(p.getCasa())
              .visitante(p.getVisitante())
              .jogadores(j)
              .build();
  }
}

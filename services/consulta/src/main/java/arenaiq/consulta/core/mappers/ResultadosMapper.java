package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.ResultadosDTO;
import arenaiq.consulta.core.models.Resultados;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ResultadosMapper {

  public List<ResultadosDTO> map(List<Resultados> r){
    return r.stream().map(res -> map(res)).collect(Collectors.toList());
  }

  public ResultadosDTO map(Resultados r){
    return ResultadosDTO.builder()
                        .id(r.getId())
                        .jogosDisputados(r.getJogosDisputados())
                        .vitorias(r.getVitorias())
                        .derrotas(r.getDerrotas())
                        .empates(r.getEmpates())
                        .aproveitamento(r.getAproveitamento())
                        .golsMarcados(r.getGolsMarcados())
                        .golsSofridos(r.getGolsSofridos())
                        .desempenho(r.getDesempenho())
                        .competicao(r.getCompeticao())
                        .equipe(r.getEquipe())
                        .temporada(r.getTemporada())
                        .build();
  }
}

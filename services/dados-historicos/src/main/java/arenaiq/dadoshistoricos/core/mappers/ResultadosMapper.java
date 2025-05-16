package arenaiq.dadoshistoricos.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.ResultadosDTO;
import arenaiq.dadoshistoricos.core.models.Resultados;

@Component
public class ResultadosMapper {
  public Resultados map(ResultadosDTO r) {
    return Resultados.builder()
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

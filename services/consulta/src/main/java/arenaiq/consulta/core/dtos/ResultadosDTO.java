package arenaiq.consulta.core.dtos;

import lombok.Data;

@Data
public class ResultadosDTO {
  private String id;
  private Byte jogosDisputados;
  private Byte vitorias;
  private Byte derrotas;
  private Byte empates;
  private Float aproveitamento;
  private Byte golsMarcados;
  private Byte golsSofridos;
  private Float desempenho;
  private String competicao;
  private String time;
  private String temporada;
}

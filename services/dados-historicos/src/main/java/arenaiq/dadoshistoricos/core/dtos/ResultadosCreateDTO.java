package arenaiq.dadoshistoricos.core.dtos;

import lombok.Data;

@Data
public class ResultadosCreateDTO {
 private Byte jogosDisputados;
  private Byte vitorias;
  private Byte derrotas;
  private Byte empates;
  private Float aproveitamento;
  private Byte golsMarcados;
  private Byte golsSofridos;
  private Byte desempenho;
  private String competicao;
  private String equipe;
  private String temporada;
}

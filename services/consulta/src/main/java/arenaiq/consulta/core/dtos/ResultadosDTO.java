package arenaiq.consulta.core.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadosDTO {
  private String id;
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

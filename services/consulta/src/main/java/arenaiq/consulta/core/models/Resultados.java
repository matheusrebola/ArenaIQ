package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Resultados {
  @PrimaryKey
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
  private String equipe;
  private String temporada;
}

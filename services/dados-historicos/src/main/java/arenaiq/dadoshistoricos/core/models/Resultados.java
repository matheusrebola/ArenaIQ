package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Resultados {
  @Id
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

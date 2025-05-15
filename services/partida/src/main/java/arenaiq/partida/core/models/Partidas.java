package arenaiq.partida.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.partida.core.models.enums.EPartida;
import lombok.Builder;
import lombok.Data;

@Document (collection = "partida")
@Data
@Builder
public class Partidas {
  @Id
  private String id;
  private EPartida partida;
  private String dataHora;
  private String local;
  private String casa;
  private String visitante;
  private String temporada;
  private String competicao;
  private String url;
}

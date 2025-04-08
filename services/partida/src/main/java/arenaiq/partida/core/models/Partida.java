package arenaiq.partida.core.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.partida.core.models.enums.EPartida;
import lombok.Data;

@Document (collection = "partida")
@Data
public class Partida {
  @Id
  private String id;
  private EPartida partida;
  private String casa;
  private String visitante;
  private String temporada;
  private LocalDateTime data;
  private String url;
}

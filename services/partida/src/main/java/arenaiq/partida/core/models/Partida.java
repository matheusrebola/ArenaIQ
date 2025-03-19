package arenaiq.partida.core.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Partida {
  @Id
  private String id;
  private EPartida partida;
  private LocalDate dataHora;
  private String url;
}

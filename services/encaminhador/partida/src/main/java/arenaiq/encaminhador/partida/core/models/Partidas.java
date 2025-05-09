package arenaiq.encaminhador.partida.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.encaminhador.partida.core.models.enums.EClima;
import lombok.Data;

@Document(collection = "partida")
@Data
public class Partidas {
  @Id
  private String id;
  private String dataHora;
  private List<EClima> clima;
  private List<Float> temperatura;
  private List<Float> umidade;
  private Integer placarC;
  private Integer placarV;
}

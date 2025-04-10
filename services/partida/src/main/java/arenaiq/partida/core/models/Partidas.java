package arenaiq.partida.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.partida.core.models.enums.EClima;
import arenaiq.partida.core.models.enums.EPartida;
import lombok.Data;

@Document (collection = "partida")
@Data
public class Partidas {
  @Id
  private String id;
  private EPartida partida;
  private String dataHora;
  private List<EClima> clima;
  private List<Float> temperatura;
  private List<Float> umidade;
  private String local;
  private String casa;
  private String visitante;
  private String temporada;
  private List<Byte> placarC;
  private List<Byte> placarV;
  private String competicao;
  private String url;
}

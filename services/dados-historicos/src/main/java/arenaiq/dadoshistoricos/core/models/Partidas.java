package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.dadoshistoricos.core.models.enums.EClima;
import arenaiq.dadoshistoricos.core.models.enums.EPartida;
import lombok.Data;

@Document (collection = "partidas")
@Data
public class Partidas {
  @Id
  private String id;
  private EPartida partida;
  private String dataHora;
  private EClima clima;
  private Float temperatura;
  private Float umidade;
  private String local;
  private String casa;
  private String visitante;
  private String temporada;
  private Byte placarC;
  private Byte placarV;
  private String competicao;
}

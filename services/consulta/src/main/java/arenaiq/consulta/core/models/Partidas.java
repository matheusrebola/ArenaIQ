package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.EClima;
import lombok.Data;

@Document (collection = "partidas")
@Data
public class Partidas {
  @Id
  private String id;
  private String dataHora;
  private EClima clima;
  private Float temperatura;
  private Float umidade;
  private String local;
  private String casa;
  private String visitante;
  private Byte placarC;
  private Byte placarV;
  private String competicao;
}

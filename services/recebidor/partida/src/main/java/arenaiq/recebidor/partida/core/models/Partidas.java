package arenaiq.recebidor.partida.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import arenaiq.recebidor.partida.core.models.enums.EClima;
import lombok.Data;

@Node
@Data
public class Partidas {
  @Id
  private String id;
  private String dataHora;
  private List<EClima> clima;
  private List<Float> temperatura;
  private List<Float> umidade;
  private Integer casa;
  private Integer visitante;
}

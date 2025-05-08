package arenaiq.recebidor.formacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Data;

@Node
@Data
public class Partida {
  @Id
  private String partida;
}

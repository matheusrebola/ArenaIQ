package arenaiq.recebidor.evento.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import arenaiq.recebidor.evento.core.models.enums.EAtor;
import lombok.Data;

@Node
@Data
public class Ator {
  @Id
  private EAtor ator;
}

package arenaiq.recebidor.evento.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import arenaiq.recebidor.evento.core.models.enums.EQualidade;
import lombok.Data;

@Node
@Data
public class Qualidade {
  @Id
  private EQualidade qualidade;
}

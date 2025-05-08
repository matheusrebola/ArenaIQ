package arenaiq.recebidor.linha.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import arenaiq.recebidor.linha.core.models.enums.ELargura;
import lombok.Data;

@Node
@Data
public class Largura {
  @Id
  private ELargura largura;
}

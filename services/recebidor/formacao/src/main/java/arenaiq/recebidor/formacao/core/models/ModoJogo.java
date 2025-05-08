package arenaiq.recebidor.formacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import arenaiq.recebidor.formacao.core.models.enums.EModoJogo;
import lombok.Data;

@Node
@Data
public class ModoJogo {
  @Id
  private EModoJogo modoJogo;
}

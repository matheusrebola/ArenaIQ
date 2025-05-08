package arenaiq.recebidor.formacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import arenaiq.recebidor.formacao.core.models.enums.EFormacao;
import lombok.Data;

@Node
@Data
public class Formacao {
  @Id
  private EFormacao formacao;
}

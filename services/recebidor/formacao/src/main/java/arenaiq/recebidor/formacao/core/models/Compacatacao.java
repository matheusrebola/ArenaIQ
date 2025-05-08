package arenaiq.recebidor.formacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import arenaiq.recebidor.formacao.core.models.enums.ECompacatacao;
import lombok.Data;

@Node
@Data
public class Compacatacao {
  @Id
  private ECompacatacao compacatacao;
}

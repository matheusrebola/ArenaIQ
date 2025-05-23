package arenaiq.recebidor.formacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;
import lombok.Data;

@Node
@Data
public class Formacoes {
  @Id
  private String id;
  private Byte minuto;
  private Byte segundo;
  @Relationship(type = "FORMACAO", direction = Direction.OUTGOING)
  private Formacao formacao;
  @Relationship(type = "MODO_JOGO", direction = Direction.OUTGOING)
  private ModoJogo modo;
  @Relationship(type = "COMPACTACAO", direction = Direction.OUTGOING)
  private Compacatacao compacatacao;
  @Relationship(type = "EQUIPE", direction = Direction.OUTGOING)
  private Equipe equipe;
  @Relationship(type = "PARTIDA", direction = Direction.OUTGOING)
  private Partida partida;
}

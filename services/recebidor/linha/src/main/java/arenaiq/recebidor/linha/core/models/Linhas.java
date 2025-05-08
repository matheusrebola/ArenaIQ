package arenaiq.recebidor.linha.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.Data;

@Node
@Data
public class Linhas {
  @Id
  private String id;
  @Relationship(type = "LINHA", direction = Direction.OUTGOING)
  private Linha linha;
  @Relationship(type = "ALTURA", direction = Direction.OUTGOING)
  private ModoJogo altura;
  @Relationship(type = "LARGURA", direction = Direction.OUTGOING)
  private Largura largura;
  private Byte minuto;
  private Byte segundo;
  @Relationship(type = "EQUIPE", direction = Direction.OUTGOING)
  private String equipe;
  @Relationship(type = "PARTIDA", direction = Direction.OUTGOING)
  private String partida;
}

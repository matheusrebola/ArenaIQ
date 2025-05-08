package arenaiq.recebidor.movimentacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.Data;

@Node
@Data
public class Movimentacoes {
  @Id
  private String id;
  @Relationship(type = "POSICAO_INICIAL", direction = Direction.OUTGOING)
  private Posicao inicial;
  @Relationship(type = "POSICAO_ATUAL", direction = Direction.OUTGOING)
  private Posicao atual;
  private Byte minuto;
  private Byte segundo;
  @Relationship(type = "PARTIDA", direction = Direction.OUTGOING)
  private Partida partida;
  @Relationship(type = "JOGADOR", direction = Direction.OUTGOING)
  private Jogador jogador;
}

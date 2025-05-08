package arenaiq.recebidor.evento.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Eventos {
  @Id
  private String id;
  @Relationship(type = "EVENTO", direction = Direction.OUTGOING)
  private Evento evento;
  @Relationship(type = "MOTIVO", direction = Direction.OUTGOING)
  private Motivo motivo;
  @Relationship(type = "QUALIDADE", direction = Direction.OUTGOING)
  private Qualidade qualidade;
  @Relationship(type = "PARTIDA", direction = Direction.OUTGOING)
  private Partida partida;
  @Relationship(type = "JOGADOR_ORIGEM", direction = Direction.OUTGOING)
  private Jogador origem;
  @Relationship(type = "JOGADOR_DESTINO", direction = Direction.OUTGOING)
  private Jogador destino;
  private Byte minuto;
  private Byte segundo;
  @Relationship(type = "ATOR_X", direction = Direction.OUTGOING)
  private Ator posicaoX;
  @Relationship(type = "ATOR_Y", direction = Direction.OUTGOING)
  private Ator posicaoY;
}

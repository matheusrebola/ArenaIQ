package arenaiq.recebidor.movimentacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Data;

@Node
@Data
public class Movimentacoes {
  @Id
  private String id;
  private EPosicao inicial;
  private EPosicao atual;
  private Byte minuto;
  private Byte segundo;
  private String partidaId;
  private String jogadorId;
}

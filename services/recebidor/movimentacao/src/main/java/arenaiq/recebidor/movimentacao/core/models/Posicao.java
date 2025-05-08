package arenaiq.recebidor.movimentacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import arenaiq.recebidor.movimentacao.core.models.enums.EPosicao;
import lombok.Data;

@Node
@Data
public class Posicao {
  @Id
  private EPosicao posicao;
}

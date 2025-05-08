package arenaiq.recebidor.movimentacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Data;

@Node
@Data
public class Jogador {
  @Id
  private String jogador;
}

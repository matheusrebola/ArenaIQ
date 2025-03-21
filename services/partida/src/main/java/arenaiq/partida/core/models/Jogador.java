package arenaiq.partida.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Jogador {
  @Id
  private String nome;
  private String lado;
}

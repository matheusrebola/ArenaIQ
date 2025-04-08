package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class JogadoresElenco {
  @Id
  private String id;
  private String elenco;
  private String temporada;
  private String jogador;
}

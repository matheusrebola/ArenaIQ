package arenaiq.partida.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document (collection = "jogadoreselenco")
@Data
public class JogadoresElenco {
  @Id
  private String id;
  private String elenco;
  private String temporada;
  private List<Jogadores> jogadores;
}
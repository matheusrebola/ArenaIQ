package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Elencos {
  @Id
  private String id;
  private String equipe;
  private String apelido;
  private String tecnico;
}

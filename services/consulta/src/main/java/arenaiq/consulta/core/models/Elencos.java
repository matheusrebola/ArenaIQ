package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "elencos")
@Data
public class Elencos {
  @Id
  private String id;
  private String apelido;
  private String equipe;
  private String tecnico;
}

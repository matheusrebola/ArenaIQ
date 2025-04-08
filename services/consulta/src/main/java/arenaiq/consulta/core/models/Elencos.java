package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Elencos {
  @Id
  private String id;
  private String apelido;
  private String anoFormacao;
  private String tecnico;
  private String equipe;
  private String temporadas;
}

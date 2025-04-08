package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Equipes {
  @Id
  private String id;
  private String nome;
  private String cidade;
  private String pais;
  private String anoFundacao;
}

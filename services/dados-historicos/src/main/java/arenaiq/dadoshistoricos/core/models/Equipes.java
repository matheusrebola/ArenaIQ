package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document (collection = "equipes")
@Data
public class Equipes {
  @Id
  private String id;
  private String nome;
  private String cidade;
  private String pais;
  private String anoFundacao;
}

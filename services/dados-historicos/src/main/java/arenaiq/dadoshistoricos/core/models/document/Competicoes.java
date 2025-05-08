package arenaiq.dadoshistoricos.core.models.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.dadoshistoricos.core.models.enums.ECompeticao;
import arenaiq.dadoshistoricos.core.models.enums.EDisputa;
import lombok.Data;

@Document (collection = "competicoes")
@Data
public class Competicoes {
  @Id
  private String id;
  private String nome;
  private ECompeticao competicao;
  private EDisputa disputa;
  private String localidade;
  private List<String> temporada;
}

package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.EContribuicao;
import arenaiq.consulta.core.models.enums.EEstilo;
import arenaiq.consulta.core.models.enums.EFuncao;
import arenaiq.consulta.core.models.enums.EPe;
import arenaiq.consulta.core.models.enums.EPersonalidade;
import lombok.Data;

@Document (collection = "jogadores")
@Data
public class Jogadores {
  @Id
  private String id;
  private String nome;
  private String dataNascimento;
  private String nacionalidade;
  private EFuncao funcao;
  private EContribuicao contribuicao;
  private EEstilo estilo;
  private EPersonalidade personalidade;
  private EPe pe;
  private Float altura;
  private Float peso;
  private String posicao;
}

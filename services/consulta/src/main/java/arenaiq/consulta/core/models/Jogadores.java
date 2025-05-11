package arenaiq.consulta.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.EContribuicao;
import arenaiq.consulta.core.models.enums.EEstilo;
import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EFuncao;
import arenaiq.consulta.core.models.enums.EPe;
import arenaiq.consulta.core.models.enums.EPersonalidade;
import arenaiq.consulta.core.models.enums.EPosicao;
import lombok.Data;

@Document (collection = "jogadores")
@Data
public class Jogadores {
  @Id
  private String id;
  private String nome;
  private String dataNascimento;
  private String nacionalidade;
  private List<EFuncao> funcao;
  private List<EContribuicao> contribuicao;
  private List<EEstilo> estilo;
  private List<EPersonalidade> personalidade;
  private EPe pe;
  private Float altura;
  private Float peso;
  private List<EPosicao> posicao;
  private List<EFunPosicao> funcaoPosicao;
  private List<Elencos> elenco;
  private String clube;
}

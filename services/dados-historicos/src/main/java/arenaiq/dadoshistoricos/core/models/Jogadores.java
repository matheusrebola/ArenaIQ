package arenaiq.dadoshistoricos.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.dadoshistoricos.core.models.enums.EContribuicao;
import arenaiq.dadoshistoricos.core.models.enums.EEstilo;
import arenaiq.dadoshistoricos.core.models.enums.EFunPosicao;
import arenaiq.dadoshistoricos.core.models.enums.EFuncao;
import arenaiq.dadoshistoricos.core.models.enums.EPe;
import arenaiq.dadoshistoricos.core.models.enums.EPersonalidade;
import arenaiq.dadoshistoricos.core.models.enums.EPosicao;
import lombok.Builder;
import lombok.Data;

@Document (collection = "jogadores")
@Data
@Builder
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

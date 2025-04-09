package arenaiq.partida.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.partida.core.models.enums.EContribuicao;
import arenaiq.partida.core.models.enums.EEstilo;
import arenaiq.partida.core.models.enums.EFunPosicao;
import arenaiq.partida.core.models.enums.EFuncao;
import arenaiq.partida.core.models.enums.EPe;
import arenaiq.partida.core.models.enums.EPersonalidade;
import arenaiq.partida.core.models.enums.EPosicao;
import lombok.Data;

@Document (collection = "jogadores")
@Data
public class Jogadores {
  @Id
  private String id;
  private String nome;
  private List<EFuncao> funcao;
  private List<EContribuicao> contribuicao;
  private List<EEstilo> estilo;
  private List<EPersonalidade> personalidade;
  private EPe pe;
  private Float altura;
  private Float peso;
  private List<EPosicao> posicao;
  private List<EFunPosicao> funcaoPosicao;
  private String lado;
  private String partida;
}

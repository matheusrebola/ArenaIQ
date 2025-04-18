package arenaiq.consulta.core.dtos;

import java.util.List;

import arenaiq.consulta.core.models.enums.EContribuicao;
import arenaiq.consulta.core.models.enums.EEstilo;
import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EFuncao;
import arenaiq.consulta.core.models.enums.EPe;
import arenaiq.consulta.core.models.enums.EPersonalidade;
import arenaiq.consulta.core.models.enums.EPosicao;
import lombok.Data;


@Data
public class JogadoresDTO {
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
}

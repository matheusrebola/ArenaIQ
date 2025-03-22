package arenaiq.dadoshistoricos.core.dtos;

import arenaiq.dadoshistoricos.core.models.enums.EContribuicao;
import arenaiq.dadoshistoricos.core.models.enums.EEstilo;
import arenaiq.dadoshistoricos.core.models.enums.EFuncao;
import arenaiq.dadoshistoricos.core.models.enums.EPe;
import arenaiq.dadoshistoricos.core.models.enums.EPersonalidade;
import lombok.Data;

@Data
public class JogadoresCreateDTO {
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

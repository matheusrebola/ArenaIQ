package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.dadoshistoricos.core.models.enums.EContribuicao;
import arenaiq.dadoshistoricos.core.models.enums.EEstilo;
import arenaiq.dadoshistoricos.core.models.enums.EFuncao;
import arenaiq.dadoshistoricos.core.models.enums.EPe;
import arenaiq.dadoshistoricos.core.models.enums.EPersonalidade;
import lombok.Data;

@Table
@Data
public class Jogadores {
  @PrimaryKey
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

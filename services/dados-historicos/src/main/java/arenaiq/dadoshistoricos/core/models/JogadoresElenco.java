package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.dadoshistoricos.core.models.enums.EContribuicao;
import arenaiq.dadoshistoricos.core.models.enums.EEstilo;
import arenaiq.dadoshistoricos.core.models.enums.EFuncao;
import arenaiq.dadoshistoricos.core.models.enums.EPersonalidade;
import lombok.Data;

@Table
@Data
public class JogadoresElenco {
  @Id
  private String id;
  private EFuncao funcao;
  private EContribuicao contribuicao;
  private EEstilo estilo;
  private EPersonalidade personalidade;
  private String elencosId;
  private String jogadorId;
}

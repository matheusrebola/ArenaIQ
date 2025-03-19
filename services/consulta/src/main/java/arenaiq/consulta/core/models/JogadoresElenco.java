package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.consulta.core.models.enums.EContribuicao;
import arenaiq.consulta.core.models.enums.EEstilo;
import arenaiq.consulta.core.models.enums.EFuncao;
import arenaiq.consulta.core.models.enums.EPersonalidade;
import lombok.Data;

@Table
@Data
public class JogadoresElenco {
  @PrimaryKey
  private String id;
  private EFuncao funcao;
  private EContribuicao contribuicao;
  private EEstilo estilo;
  private EPersonalidade personalidade;
  private String elencosId;
  private String jogadorId;
}

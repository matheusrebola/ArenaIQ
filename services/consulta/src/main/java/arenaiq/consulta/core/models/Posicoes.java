package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EPosicao;
import lombok.Data;

@Table
@Data
public class Posicoes {
  @PrimaryKey
  private String id;
  private EPosicao posicao;
  private EFunPosicao funcao;
  private String descricao;
}

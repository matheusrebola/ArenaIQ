package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.dadoshistoricos.core.models.enums.EFunPosicao;
import arenaiq.dadoshistoricos.core.models.enums.EPosicao;
import lombok.Data;

@Table
@Data
public class Posicoes {
  @Id
  private String id;
  private EPosicao posicao;
  private EFunPosicao funcao;
  private String descricao;
}

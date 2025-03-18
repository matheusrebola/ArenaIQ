package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.dadoshistoricos.core.models.enums.ECompeticao;
import arenaiq.dadoshistoricos.core.models.enums.EDisputa;
import lombok.Data;

@Table
@Data
public class Competicoes {
  @PrimaryKey
  private String id;
  private String nome;
  private String temporadaId;
  private ECompeticao competicao;
  private EDisputa disputa;
  private String localidade;
}

package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Elencos {
  @PrimaryKey
  private String id;
  private String nomeElenco;
  private String anoFormacao;
  private String tecnicoId;
  private String timeId;
  private String temporadasId;
}

package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Elencos {
  @Id
  private String id;
  private String nomeElenco;
  private String anoFormacao;
  private String tecnicoId;
  private String timeId;
  private String temporadasId;
}

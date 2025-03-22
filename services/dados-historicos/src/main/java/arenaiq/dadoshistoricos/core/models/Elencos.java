package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Elencos {
  @PrimaryKey
  private String id;
  private String equipe;
  private String apelido;
  private String tecnico;
}

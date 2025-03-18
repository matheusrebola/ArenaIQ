package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Temporadas {
  @PrimaryKey
  private String id;
  private String temporada;
  private String dataInicio;
  private String dataFim;
}

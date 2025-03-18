package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Temporadas {
  @Id
  private String id;
  private String temporada;
  private String dataInicio;
  private String dataFim;
}

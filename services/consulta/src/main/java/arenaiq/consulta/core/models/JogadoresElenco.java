package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class JogadoresElenco {
  @PrimaryKey
  private String id;
  private String elenco;
  private String temporada;
  private String jogador;
}

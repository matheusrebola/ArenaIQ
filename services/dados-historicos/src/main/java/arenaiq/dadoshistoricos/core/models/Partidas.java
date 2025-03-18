package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Partidas {
  private String id;
}

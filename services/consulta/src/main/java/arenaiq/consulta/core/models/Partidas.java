package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Partidas {
  @PrimaryKey
  private String id;
  private String dataHora;
  private String local;
  private String casa;
  private String visitante;
  private Byte placarC;
  private Byte placarV;
  private String competicao;
}

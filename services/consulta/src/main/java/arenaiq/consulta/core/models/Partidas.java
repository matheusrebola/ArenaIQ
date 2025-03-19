package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Partidas {
  @PrimaryKey
  private String id;
  private String data;
  private String local;
  private String casaId;
  private String visitanteId;
  private Byte placarCasa;
  private Byte placarVisitante;
  private String competicao;
}

package arenaiq.persistencia.linhadefensiva.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class LinhaDefensiva {
  @PrimaryKey
  private String id;
  private Float altura;
  private Float largura;
  private Byte minuto;
  private Byte segundo;
  private String timeId;
  private String partidaId;
}

package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.consulta.core.models.enums.ECompacatacao;
import arenaiq.consulta.core.models.enums.EFormacao;
import arenaiq.consulta.core.models.enums.EModoJogo;
import lombok.Data;

@Table
@Data
public class Formacoes {
  @PrimaryKey
  private String id;
  private Byte minuto;
  private Byte segundo;
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compacatacao;
  private String timeId;
  private String partidaId;
}

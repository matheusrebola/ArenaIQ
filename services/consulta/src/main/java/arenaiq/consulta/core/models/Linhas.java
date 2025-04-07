package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.consulta.core.models.enums.ELargura;
import arenaiq.consulta.core.models.enums.ELinha;
import arenaiq.consulta.core.models.enums.EModoJogo;
import lombok.Data;

@Table
@Data
public class Linhas {
  @PrimaryKey
  private String id;
  private ELinha linha;
  private EModoJogo altura;
  private ELargura largura;
  private Byte minuto;
  private Byte segundo;
  private String equipeId;
  private String partidaId;
}

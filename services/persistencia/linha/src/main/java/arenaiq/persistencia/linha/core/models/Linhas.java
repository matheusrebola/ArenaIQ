package arenaiq.persistencia.linha.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.persistencia.linha.core.models.enums.ELinha;
import lombok.Data;

@Table
@Data
public class Linhas {
  @PrimaryKey
  private String id;
  private Float altura;
  private Float largura;
  private ELinha linha;
  private Byte minuto;
  private Byte segundo;
  private String timeId;
  private String partidaId;
}

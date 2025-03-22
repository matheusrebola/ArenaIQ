package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.consulta.core.models.enums.EEvento;
import arenaiq.consulta.core.models.enums.EMotivo;
import lombok.Data;

@Table
@Data
public class Eventos {
  @PrimaryKey
  private String id;
  private EEvento evento;
  private EMotivo motivo;
  private Byte minuto;
  private Byte segundo;
  private Float posicaoX;
  private Float posicaoY;
  private String jogadorId;
  private String partidaId;
  private String detalheId;
}

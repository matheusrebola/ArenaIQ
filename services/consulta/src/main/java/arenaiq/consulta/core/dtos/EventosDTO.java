package arenaiq.consulta.core.dtos;

import arenaiq.consulta.core.models.enums.EEvento;
import arenaiq.consulta.core.models.enums.EMotivo;
import lombok.Data;

@Data
public class EventosDTO {
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

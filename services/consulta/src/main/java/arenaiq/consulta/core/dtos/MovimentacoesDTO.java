package arenaiq.consulta.core.dtos;

import arenaiq.consulta.core.models.enums.EPosicao;
import lombok.Data;

@Data
public class MovimentacoesDTO {
  private String id;
  private EPosicao inicial;
  private EPosicao atual;
  private Byte minuto;
  private Byte segundo;
  private String partidaId;
  private String jogadorId;
}

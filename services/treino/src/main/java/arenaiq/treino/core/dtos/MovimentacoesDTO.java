package arenaiq.treino.core.dtos;

import arenaiq.treino.core.models.enums.EPosicao;
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

package arenaiq.consulta.core.dtos;

import arenaiq.consulta.core.models.enums.ELinha;
import lombok.Data;

@Data
public class LinhasDTO {
  private String id;
  private Float altura;
  private Float largura;
  private ELinha linha;
  private Byte minuto;
  private Byte segundo;
  private String timeId;
  private String partidaId;
}

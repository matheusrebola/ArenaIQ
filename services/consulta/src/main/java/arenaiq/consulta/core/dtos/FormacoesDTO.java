package arenaiq.consulta.core.dtos;

import arenaiq.consulta.core.models.enums.ECompacatacao;
import arenaiq.consulta.core.models.enums.EFormacao;
import arenaiq.consulta.core.models.enums.EModoJogo;
import lombok.Data;

@Data
public class FormacoesDTO {
  private String id;
  private Byte minuto;
  private Byte segundo;
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compacatacao;
  private String timeId;
  private String partidaId;
}

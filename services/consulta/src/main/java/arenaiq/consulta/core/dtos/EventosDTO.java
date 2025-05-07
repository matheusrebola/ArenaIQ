package arenaiq.consulta.core.dtos;

import arenaiq.consulta.core.models.enums.EAtor;
import arenaiq.consulta.core.models.enums.EEvento;
import arenaiq.consulta.core.models.enums.EMotivo;
import arenaiq.consulta.core.models.enums.EQualidade;
import lombok.Data;

@Data
public class EventosDTO {
  private String id;
  private EEvento evento;
  private EMotivo motivo;
  private EQualidade qualidade;
  private String partida;
  private String origem; //jogador de origem
  private String destino; //jogador destino
  private Byte minuto;
  private Byte segundo;
  private EAtor posicaoX;
  private EAtor posicaoY;
}

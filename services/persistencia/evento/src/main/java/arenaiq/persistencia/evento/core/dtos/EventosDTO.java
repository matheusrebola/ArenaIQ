package arenaiq.persistencia.evento.core.dtos;

import arenaiq.persistencia.evento.core.models.enums.EAtor;
import arenaiq.persistencia.evento.core.models.enums.EEvento;
import arenaiq.persistencia.evento.core.models.enums.EMotivo;
import arenaiq.persistencia.evento.core.models.enums.EQualidade;
import lombok.Data;

@Data
public class EventosDTO {
  private String id;
  private EEvento evento;
  private EMotivo motivo;
  private EQualidade qualidade;
  private String partidaId;
  private String origem; //jogador de origem
  private String destino; //jogador destino
  private Byte minuto;
  private Byte segundo;
  private EAtor posicaoX;
  private EAtor posicaoY;
}

package arenaiq.encaminhador.evento.core.dtos;

import arenaiq.encaminhador.evento.core.models.enums.EEvento;
import arenaiq.encaminhador.evento.core.models.enums.EMotivo;
import arenaiq.encaminhador.evento.core.models.enums.EAtor;
import lombok.Data;

@Data
public class EventoDTO {
  private String id;
  private EEvento evento;
  private EMotivo motivo;
  private String partidaId;
  private String origem; //jogador de origem
  private String destino; //jogador destino
  private Byte minuto;
  private Byte segundo;
  private EAtor posicaoX;
  private EAtor posicaoY;
}

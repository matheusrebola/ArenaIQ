package arenaiq.encaminhador.evento.core.dtos;

import arenaiq.encaminhador.evento.core.models.EEvento;
import arenaiq.encaminhador.evento.core.models.EMotivo;
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
  private Float posicaoX;
  private Float posicaoY;
  private Float distancia;
}

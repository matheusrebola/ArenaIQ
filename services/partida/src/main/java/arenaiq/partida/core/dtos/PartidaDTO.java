package arenaiq.partida.core.dtos;

import java.time.LocalDateTime;

import arenaiq.partida.core.models.enums.EPartida;
import lombok.Data;

@Data
public class PartidaDTO {
  private String id;
  private EPartida partida;
  private String casa;
  private String visitante;
  private String temporada;
  private LocalDateTime data;
  private String url;
}

package arenaiq.partida.core.dtos;

import java.time.LocalDate;

import arenaiq.partida.core.models.EPartida;
import lombok.Data;

@Data
public class PartidaDTO {
  private EPartida partida;
  private LocalDate dataHora;
  private String url;
}

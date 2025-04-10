package arenaiq.partida.core.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ElencosDTO {
  private String temporada;
  private String casa;
  private String visitante;
  private String partida;
}

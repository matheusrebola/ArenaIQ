package arenaiq.partida.core.dtos;

import arenaiq.partida.core.models.enums.EPartida;
import lombok.Data;

@Data
public class PartidasCreateDTO {
  private EPartida partida;
  private String dataHora;
  private String local;
  private String casa;
  private String visitante;
  private String temporada;
  private String competicao;
  private String url;
}

package arenaiq.partida.core.dtos;

import arenaiq.partida.core.models.enums.EPartida;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PartidasDTO {
  private String id;
  private EPartida partida;
  private String dataHora;
  private String local;
  private String casa;
  private String visitante;
  private String temporada;
  private String competicao;
  private String url;
}

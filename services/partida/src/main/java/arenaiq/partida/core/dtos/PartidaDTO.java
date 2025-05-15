package arenaiq.partida.core.dtos;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PartidaDTO {
  private String id;
  private String local;
  private String casa;
  private String visitante;
  private List<JogadoresDTO> jogadores;
}

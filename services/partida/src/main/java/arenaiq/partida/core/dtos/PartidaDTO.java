package arenaiq.partida.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class PartidaDTO {
  private String id;
  private String local;
  private String casa;
  private String visitante;
  private List<JogadoresDTO> jogadores;
}

package arenaiq.partida.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class PartidaDTO {
  private String id;
  private String casa;
  private String visitante;
  private String temporada;
  private String url;
  private List<JogadoresDTO> jogadores;
}

package arenaiq.dadoshistoricos.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class JogadoresElencoCreateDTO {
  private String elenco;
  private String temporada;
  private List<JogadoresDTO> jogadores;
}

package arenaiq.dadoshistoricos.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class JogadoresElencoCreateDTO {
  private String elenco;
  private List<String> temporada;
  private List<String> jogadores;
}

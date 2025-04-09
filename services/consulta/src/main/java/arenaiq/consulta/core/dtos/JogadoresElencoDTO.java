package arenaiq.consulta.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class JogadoresElencoDTO {
  private String id;
  private String elenco;
  private List<String> temporada;
  private List<String> jogadores;
}

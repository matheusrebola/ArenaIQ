package arenaiq.partida.core.dtos;

import java.util.List;

import arenaiq.partida.core.models.Jogadores;
import lombok.Data;

@Data
public class PartidaDTO {
  private String id;
  private String local;
  private String casa;
  private String visitante;
  private List<Jogadores> jogadores;
}

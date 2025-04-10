package arenaiq.partida.core.dtos;

import java.util.List;

import arenaiq.partida.core.models.enums.EClima;
import arenaiq.partida.core.models.enums.EPartida;
import lombok.Data;

@Data
public class PartidasDTO {
  private String id;
  private EPartida partida;
  private String dataHora;
  private List<EClima> clima;
  private List<Float> temperatura;
  private List<Float> umidade;
  private String local;
  private String casa;
  private String visitante;
  private String temporada;
  private List<Byte> placarC;
  private List<Byte> placarV;
  private String competicao;
  private String url;
}

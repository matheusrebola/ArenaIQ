package arenaiq.dadoshistoricos.core.dtos;

import arenaiq.dadoshistoricos.core.models.enums.EClima;
import lombok.Data;

@Data
public class PartidasCreateDTO {
  private String dataHora;
  private EClima clima;
  private Float temperatura;
  private Float umidade;
  private String local;
  private String casa;
  private String visitante;
  private Byte placarC;
  private Byte placarV;
  private String competicao;
}

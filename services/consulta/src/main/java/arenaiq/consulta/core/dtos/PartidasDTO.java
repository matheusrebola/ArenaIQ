package arenaiq.consulta.core.dtos;

import arenaiq.consulta.core.models.enums.EClima;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PartidasDTO {
  private String id;
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

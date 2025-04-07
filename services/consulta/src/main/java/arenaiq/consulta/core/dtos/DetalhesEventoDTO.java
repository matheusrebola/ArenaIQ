package arenaiq.consulta.core.dtos;

import lombok.Data;

@Data
public class DetalhesEventoDTO {
  private String id;
  private String rPrimario;
  private String rSecundario;
  private Float distancia;
  private Boolean pressaoAdversaria;
  private Float nivelPressao;
  private String jOrigemId;
  private String jDestinoId;
}

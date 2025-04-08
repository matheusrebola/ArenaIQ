package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class DetalhesEvento {
  @Id
  private String id;
  private String rPrimario;
  private String rSecundario;
  private Float distancia;
  private Boolean pressaoAdversaria;
  private Float nivelPressao;
  private String jOrigemId;
  private String jDestinoId;
}

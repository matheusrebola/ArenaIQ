package arenaiq.encaminhador.evento.core.models;

import org.springframework.data.annotation.Id;

import lombok.Data;

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
  private String eventoId;
}

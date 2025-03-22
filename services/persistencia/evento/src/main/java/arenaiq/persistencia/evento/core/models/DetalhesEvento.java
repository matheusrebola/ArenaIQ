package arenaiq.persistencia.evento.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class DetalhesEvento {
  @PrimaryKey
  private String id;
  private String rPrimario;
  private String rSecundario;
  private Float distancia;
  private Boolean pressaoAdversaria;
  private Float nivelPressao;
  private String jOrigemId;
  private String jDestinoId;
}

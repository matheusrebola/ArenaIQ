package arenaiq.persistencia.partida.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;

import arenaiq.persistencia.partida.core.models.enums.EClima;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Partidas {
  @Id
  private String id;
  private String dataHora;
  private List<EClima> clima;
  private List<Float> temperatura;
  private List<Float> umidade;
  private Integer casa;
  private Integer visitante;
}

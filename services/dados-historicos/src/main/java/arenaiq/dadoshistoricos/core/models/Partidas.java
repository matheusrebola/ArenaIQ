package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.dadoshistoricos.core.models.enums.EClima;
import lombok.Data;

@Table
@Data
public class Partidas {
  @PrimaryKey
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

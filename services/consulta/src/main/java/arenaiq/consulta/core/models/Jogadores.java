package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.consulta.core.models.enums.EPe;
import lombok.Data;

@Table
@Data
public class Jogadores {
  @PrimaryKey
  private String id;
  private String nome;
  private String dataNascimento;
  private String nacionalidade;
  private EPe pe;
  private Float altura;
  private Float peso;
  private String posicaoId;
}

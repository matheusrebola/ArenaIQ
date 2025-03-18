package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.dadoshistoricos.core.models.enums.EPe;
import lombok.Data;

@Table
@Data
public class Jogadores {
  @Id
  private String id;
  private String nome;
  private String dataNascimento;
  private String nacionalidade;
  private EPe pe;
  private Float altura;
  private Float peso;
  private String posicaoId;
}

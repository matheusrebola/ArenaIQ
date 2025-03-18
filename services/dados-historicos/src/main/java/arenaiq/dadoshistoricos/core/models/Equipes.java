package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Equipes {
  @Id
  private String id;
  private String nome;
  private String cidade;
  private String pais;
  private String anoFundacao;
  private String tecnicoAtual;
  private String tecnicoId;
  private String partidasId;
}

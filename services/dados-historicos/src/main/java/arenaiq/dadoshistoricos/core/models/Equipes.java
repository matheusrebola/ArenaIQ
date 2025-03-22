package arenaiq.dadoshistoricos.core.models;

import java.time.LocalDate;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Equipes {
  @PrimaryKey
  private String id;
  private String nome;
  private String cidade;
  private String pais;
  private LocalDate anoFundacao;
}

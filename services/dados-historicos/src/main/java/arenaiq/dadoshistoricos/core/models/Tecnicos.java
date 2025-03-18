package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.dadoshistoricos.core.models.enums.EFilosofia;
import lombok.Data;

@Table
@Data
public class Tecnicos {
  @Id
  private String id;
  private String nome;
  private String nacionalidade;
  private String dataNascimento;
  private Byte anosExperiencia;
  private EFilosofia filosofia;
}

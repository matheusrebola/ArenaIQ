package arenaiq.consulta.core.models;

import java.time.LocalDate;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.consulta.core.models.enums.EFilosofia;
import lombok.Data;

@Table
@Data
public class Tecnicos {
  @PrimaryKey
  private String id;
  private String nome;
  private String nacionalidade;
  private LocalDate dataNascimento;
  private Byte anosExperiencia;
  private EFilosofia filosofia;
}

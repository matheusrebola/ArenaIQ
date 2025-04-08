package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.EFilosofia;
import lombok.Data;

@Document
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

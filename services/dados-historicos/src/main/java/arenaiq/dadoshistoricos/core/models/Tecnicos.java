package arenaiq.dadoshistoricos.core.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.dadoshistoricos.core.models.enums.EFilosofia;
import lombok.Data;

@Document
@Data
public class Tecnicos {
  @Id
  private String id;
  private String nome;
  private String nacionalidade;
  private LocalDate dataNascimento;
  private Byte anosExperiencia;
  private EFilosofia filosofia;
}

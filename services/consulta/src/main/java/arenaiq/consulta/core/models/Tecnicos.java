package arenaiq.consulta.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.EFilosofia;
import lombok.Data;

@Document (collection = "tecnicos")
@Data
public class Tecnicos {
  @Id
  private String id;
  private String nome;
  private String nacionalidade;
  private String dataNascimento;
  private Byte anosExperiencia;
  private List<EFilosofia> filosofia;
  private String jogador;
}

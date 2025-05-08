package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.ELargura;
import arenaiq.consulta.core.models.enums.ELinha;
import arenaiq.consulta.core.models.enums.EModoJogo;
import lombok.Data;

@Document (collection = "linhas")
@Data
public class Linhas {
  @Id
  private String id;
  private ELinha linha;
  private EModoJogo altura;
  private ELargura largura;
  private Byte minuto;
  private Byte segundo;
  private String equipe;
  private String partida;
}

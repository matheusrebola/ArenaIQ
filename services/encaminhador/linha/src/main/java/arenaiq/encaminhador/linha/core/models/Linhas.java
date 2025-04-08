package arenaiq.encaminhador.linha.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.encaminhador.linha.core.models.enums.ELargura;
import arenaiq.encaminhador.linha.core.models.enums.ELinha;
import arenaiq.encaminhador.linha.core.models.enums.EModoJogo;
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
  private String equipeId;
  private String partidaId;
}

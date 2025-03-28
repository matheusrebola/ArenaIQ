package arenaiq.encaminhador.linha.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.encaminhador.linha.core.models.enums.ELinha;
import lombok.Data;

@Document
@Data
public class Linhas {
  @Id
  private String id;
  private Float altura;
  private Float largura;
  private ELinha linha;
  private Byte minuto;
  private Byte segundo;
  private String timeId;
  private String partidaId;
}

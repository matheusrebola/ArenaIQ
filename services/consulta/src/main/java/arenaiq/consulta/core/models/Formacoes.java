package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.ECompacatacao;
import arenaiq.consulta.core.models.enums.EFormacao;
import arenaiq.consulta.core.models.enums.EModoJogo;
import lombok.Data;

@Document (collection = "formacoes")
@Data
public class Formacoes {
  @Id
  private String id;
  private Byte minuto;
  private Byte segundo;
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compactacao;
  private String timeId;
  private String partidaId;
}

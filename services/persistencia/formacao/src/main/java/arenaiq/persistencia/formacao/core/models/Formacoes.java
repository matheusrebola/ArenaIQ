package arenaiq.persistencia.formacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Formacoes {
  @Id
  private String id;
  private Byte minuto;
  private Byte segundo;
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compacatacao;
  private String timeId;
  private String partidaId;
}

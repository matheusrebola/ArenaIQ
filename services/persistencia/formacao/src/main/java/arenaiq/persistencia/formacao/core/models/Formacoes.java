package arenaiq.persistencia.formacao.core.models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Table
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

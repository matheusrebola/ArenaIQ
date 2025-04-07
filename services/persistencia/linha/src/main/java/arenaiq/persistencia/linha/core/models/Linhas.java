package arenaiq.persistencia.linha.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.persistencia.linha.core.models.enums.ELargura;
import arenaiq.persistencia.linha.core.models.enums.ELinha;
import arenaiq.persistencia.linha.core.models.enums.EModoJogo;
import lombok.Data;

@Table
@Data
public class Linhas {
  @Id
  private String id;
  private ELinha linha;
  private EModoJogo altura;
  private ELargura largura;
  private Byte minuto;
  private Byte segundo;
  private String timeId;
  private String partidaId;
}

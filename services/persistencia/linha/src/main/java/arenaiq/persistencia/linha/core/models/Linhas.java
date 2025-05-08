package arenaiq.persistencia.linha.core.models;

import arenaiq.persistencia.linha.core.models.enums.ELargura;
import arenaiq.persistencia.linha.core.models.enums.ELinha;
import arenaiq.persistencia.linha.core.models.enums.EModoJogo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
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
  private String partidaId;
}

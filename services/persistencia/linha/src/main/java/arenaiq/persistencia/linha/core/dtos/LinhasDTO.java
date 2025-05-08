package arenaiq.persistencia.linha.core.dtos;

import arenaiq.persistencia.linha.core.models.enums.ELargura;
import arenaiq.persistencia.linha.core.models.enums.ELinha;
import arenaiq.persistencia.linha.core.models.enums.EModoJogo;
import lombok.Data;

@Data
public class LinhasDTO {
  private String id;
  private ELinha linha;
  private EModoJogo altura;
  private ELargura largura;
  private Byte minuto;
  private Byte segundo;
  private String equipe;
  private String partida;
}

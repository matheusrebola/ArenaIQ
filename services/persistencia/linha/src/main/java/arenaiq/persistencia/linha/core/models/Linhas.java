package arenaiq.persistencia.linha.core.models;

import arenaiq.persistencia.linha.core.models.enums.ELargura;
import arenaiq.persistencia.linha.core.models.enums.ELinha;
import arenaiq.persistencia.linha.core.models.enums.EModoJogo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Linhas {
  @Id
  @Column(length = 50)
  private String id;
  @Column(length = 10)
  private ELinha linha;
  @Column(length = 15)
  private EModoJogo altura;
  @Column(length = 15)
  private ELargura largura;
  private Byte minuto;
  private Byte segundo;
  @Column(length = 50)
  private String equipe;
  @Column(length = 50)
  private String partida;
}

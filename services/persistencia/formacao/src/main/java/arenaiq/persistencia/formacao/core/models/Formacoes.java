package arenaiq.persistencia.formacao.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Formacoes {
  @Id
  @Column(length = 50)
  private String id;
  private Byte minuto;
  private Byte segundo;
  @Column(length = 7)
  private EFormacao formacao;
  @Column(length = 15)
  private EModoJogo modo;
  @Column(length = 15)
  private ECompacatacao compacatacao;
  @Column(length = 50)
  private String time;
  @Column(length = 50)
  private String partida;
}

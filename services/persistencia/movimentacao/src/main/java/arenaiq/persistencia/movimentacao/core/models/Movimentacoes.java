package arenaiq.persistencia.movimentacao.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movimentacoes {
  @Id  
  @Column(length = 50)
  private String id;
  @Column(length = 3)
  private EPosicao inicial;
  @Column(length = 50)
  private EPosicao atual;
  private Byte minuto;
  private Byte segundo;
  @Column(length = 50)
  private String partida;
  @Column(length = 50)
  private String jogador;
}

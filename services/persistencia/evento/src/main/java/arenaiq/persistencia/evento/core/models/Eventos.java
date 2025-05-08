package arenaiq.persistencia.evento.core.models;

import arenaiq.persistencia.evento.core.models.enums.EAtor;
import arenaiq.persistencia.evento.core.models.enums.EEvento;
import arenaiq.persistencia.evento.core.models.enums.EMotivo;
import arenaiq.persistencia.evento.core.models.enums.EQualidade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Eventos {
  @Id
  @Column(length = 50)
  private String id;
  @Column(length = 25)
  private EEvento evento;
  @Column(length = 25)
  private EMotivo motivo;
  @Column(length = 15)
  private EQualidade qualidade;
  @Column(length = 50)
  private String partida;
  @Column(length = 50)
  private String origem;
  @Column(length = 50)
  private String destino;
  private Byte minuto;
  private Byte segundo;
  @Column(length = 25)
  private EAtor posicaoX;
  @Column(length = 25)
  private EAtor posicaoY;
}

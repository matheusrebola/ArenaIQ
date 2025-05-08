package arenaiq.persistencia.movimentacao.core.models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Table
@Data
public class Movimentacoes {
  @Id
  private String id;
  private EPosicao inicial;
  private EPosicao atual;
  private Byte minuto;
  private Byte segundo;
  private String partidaId;
  private String jogadorId;
}

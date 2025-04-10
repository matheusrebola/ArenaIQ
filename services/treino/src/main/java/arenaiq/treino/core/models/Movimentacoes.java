package arenaiq.treino.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.EPosicao;
import lombok.Data;

@Document (collection = "movimentacoes")
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

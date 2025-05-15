package arenaiq.treino.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.EFormacao;
import arenaiq.treino.core.models.enums.EPosicao;
import lombok.Builder;
import lombok.Data;

@Document(collection = "movimentacoes")
@Data
@Builder
public class Movimentacoes {
  @Id
  private String id;
  private EPosicao inicial;
  private EPosicao atual;
  private EFormacao formacao;
  private String url;
}

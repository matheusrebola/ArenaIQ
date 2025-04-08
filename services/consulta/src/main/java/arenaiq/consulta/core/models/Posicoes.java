package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EPosicao;
import lombok.Data;

@Document
@Data
public class Posicoes {
  @Id
  private String id;
  private EPosicao posicao;
  private EFunPosicao funcao;
  private String descricao;
}

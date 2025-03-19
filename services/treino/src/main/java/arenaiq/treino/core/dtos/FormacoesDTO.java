package arenaiq.treino.core.dtos;

import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.ECompacatacao;
import arenaiq.treino.core.models.enums.EFormacao;
import arenaiq.treino.core.models.enums.EModoJogo;
import lombok.Data;

@Document
@Data
public class FormacoesDTO {
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compacatacao;
  private String url;
}

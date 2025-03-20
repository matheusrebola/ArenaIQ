package arenaiq.treino.core.dtos;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class LinhaDTO {
  private String id;
  private Float altura;
  private Float largura;
  private String url;
}

package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EParticipante;
import lombok.Data;

@Document (collection = "titulos")
@Data
public class Titulos {
  @Id
  private String id;
  private String nome;
  private EParticipante participante;
  private String temporada;
  private String posicao;
  private String mvp;
  private ECompeticao tipoTitulo;
  private String equipe;
  private String competicao;
}

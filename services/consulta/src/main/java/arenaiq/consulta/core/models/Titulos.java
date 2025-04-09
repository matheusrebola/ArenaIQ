package arenaiq.consulta.core.models;

import java.util.List;

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
  private Byte posicao;
  private List<String> mvp; //lista dos onze melhores jogadores
  private List<String> mvc; //lista dos cinco melhores técnicos
  private ECompeticao tipoTitulo;
  private String equipe;
  private String competicao;
}

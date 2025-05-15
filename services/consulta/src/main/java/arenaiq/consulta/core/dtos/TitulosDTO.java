package arenaiq.consulta.core.dtos;

import java.util.List;

import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EParticipante;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TitulosDTO {
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

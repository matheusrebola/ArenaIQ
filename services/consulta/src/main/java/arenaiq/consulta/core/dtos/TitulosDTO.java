package arenaiq.consulta.core.dtos;

import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EParticipante;
import lombok.Data;

@Data
public class TitulosDTO {
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

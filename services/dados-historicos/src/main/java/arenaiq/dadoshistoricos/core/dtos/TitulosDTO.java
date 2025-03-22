package arenaiq.dadoshistoricos.core.dtos;

import arenaiq.dadoshistoricos.core.models.enums.ECompeticao;
import arenaiq.dadoshistoricos.core.models.enums.EParticipante;
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

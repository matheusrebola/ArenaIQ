package arenaiq.dadoshistoricos.core.dtos;

import java.util.List;

import arenaiq.dadoshistoricos.core.models.enums.ECompeticao;
import arenaiq.dadoshistoricos.core.models.enums.EParticipante;
import lombok.Data;

@Data
public class TitulosDTO {
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

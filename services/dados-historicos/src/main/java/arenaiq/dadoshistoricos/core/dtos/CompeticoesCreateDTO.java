package arenaiq.dadoshistoricos.core.dtos;

import java.util.List;

import arenaiq.dadoshistoricos.core.models.enums.ECompeticao;
import arenaiq.dadoshistoricos.core.models.enums.EDisputa;
import lombok.Data;

@Data
public class CompeticoesCreateDTO {
  private String nome;
  private ECompeticao competicao;
  private EDisputa disputa;
  private String localidade;
  private List<String> temporada;
}

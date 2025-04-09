package arenaiq.consulta.core.dtos;

import java.util.List;

import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EDisputa;
import lombok.Data;

@Data
public class CompeticoesDTO {
  private String id;
  private String nome;
  private ECompeticao competicao;
  private EDisputa disputa;
  private String localidade;
  private List<String> temporada;
}

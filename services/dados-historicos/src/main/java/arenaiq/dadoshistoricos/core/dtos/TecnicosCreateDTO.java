package arenaiq.dadoshistoricos.core.dtos;

import arenaiq.dadoshistoricos.core.models.enums.EFilosofia;
import lombok.Data;

@Data
public class TecnicosCreateDTO {
  private String nome;
  private String nacionalidade;
  private String dataNascimento;
  private Byte anosExperiencia;
  private EFilosofia filosofia;
}

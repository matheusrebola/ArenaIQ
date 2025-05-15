package arenaiq.consulta.core.dtos;

import java.util.List;

import arenaiq.consulta.core.models.enums.EFilosofia;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TecnicosDTO {
  private String id;
  private String nome;
  private String nacionalidade;
  private String dataNascimento;
  private Byte anosExperiencia;
  private List<EFilosofia> filosofia;
  private String jogador;
}

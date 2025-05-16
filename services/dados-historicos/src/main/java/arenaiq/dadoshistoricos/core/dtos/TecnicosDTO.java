package arenaiq.dadoshistoricos.core.dtos;

import java.util.List;

import arenaiq.dadoshistoricos.core.models.enums.EFilosofia;
import arenaiq.dadoshistoricos.core.models.enums.EPosicao;
import lombok.Data;

@Data
public class TecnicosDTO {
  private String nome;
  private String nacionalidade;
  private String dataNascimento;
  private Byte anosExperiencia;
  private List<EFilosofia> filosofia;
  private List<EPosicao> posicoes;
}

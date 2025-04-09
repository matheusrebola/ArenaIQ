package arenaiq.consulta.core.dtos;

import java.util.List;

import arenaiq.consulta.core.models.enums.EClima;
import arenaiq.consulta.core.models.enums.ECobertura;
import arenaiq.consulta.core.models.enums.EDrenagem;
import arenaiq.consulta.core.models.enums.EGRama;
import arenaiq.consulta.core.models.enums.EInclinacao;
import arenaiq.consulta.core.models.enums.EVento;
import lombok.Data;

@Data
public class EstadiosDTO {
  private String id;
  private String nome;
  private String cidade;
  private String pais;
  private List<String> clubeMandante;
  private Integer capacidade;
  private List<EGRama> grama;
  private Byte comprimento;
  private Byte largura;
  private ECobertura cobertura;
  private EDrenagem drenagem;
  private EInclinacao inclinacao;
  private EVento vento;
  private List<EClima> clima;
  private String ultimoReparo;
  private List<String> observacoes;
}

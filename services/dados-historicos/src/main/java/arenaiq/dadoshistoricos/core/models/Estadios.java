package arenaiq.dadoshistoricos.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.dadoshistoricos.core.models.enums.EClima;
import arenaiq.dadoshistoricos.core.models.enums.ECobertura;
import arenaiq.dadoshistoricos.core.models.enums.EDrenagem;
import arenaiq.dadoshistoricos.core.models.enums.EGrama;
import arenaiq.dadoshistoricos.core.models.enums.EInclinacao;
import arenaiq.dadoshistoricos.core.models.enums.EVento;
import lombok.Builder;
import lombok.Data;

@Document (collection = "estadios")
@Data
@Builder
public class Estadios {
  @Id
  private String id;
  private String nome;
  private String cidade;
  private String pais;
  private List<String> clubeMandante;
  private Integer capacidade;
  private List<EGrama> grama;
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

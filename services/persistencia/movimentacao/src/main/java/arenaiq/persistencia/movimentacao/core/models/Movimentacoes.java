package arenaiq.persistencia.movimentacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Movimentacoes {
  @Id
  private String id;
  private Float eixoX;
  private Float eixoY;
  private Float velocidade;
  private Float aceleracao;
  private Byte minuto;
  private Byte segundo;
  private Boolean pressao;
  private String partidaId;
  private String jogadorId;
}

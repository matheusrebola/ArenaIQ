package arenaiq.persistencia.formacao.core.dtos;

import arenaiq.persistencia.formacao.core.models.ECompacatacao;
import arenaiq.persistencia.formacao.core.models.EFormacao;
import arenaiq.persistencia.formacao.core.models.EModoJogo;
import lombok.Data;

@Data
public class FormacoesDTO {
  private String id;
  private Byte minuto;
  private Byte segundo;
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compacatacao;
  private String time;
  private String partida;
}

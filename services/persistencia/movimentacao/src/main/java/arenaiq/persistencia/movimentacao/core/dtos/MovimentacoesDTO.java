package arenaiq.persistencia.movimentacao.core.dtos;

import arenaiq.persistencia.movimentacao.core.models.EPosicao;
import lombok.Data;

@Data
public class MovimentacoesDTO {
  private String id;
  private EPosicao inicial;
  private EPosicao atual;
  private Byte minuto;
  private Byte segundo;
  private String partida;
  private String jogador;
}

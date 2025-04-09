package arenaiq.persistencia.movimentacao.core.dtos;

import lombok.Data;

@Data
public class MovimentacoesDTO {
  private String id;
  private Float eixoX;
  private Float eixoY;
  private Float velocidadeX;
  private Float velocidadeY;
  private Byte minuto;
  private Byte segundo;
  private String partidaId;
  private String jogadorId;
}

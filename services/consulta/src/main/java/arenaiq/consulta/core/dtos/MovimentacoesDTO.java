package arenaiq.consulta.core.dtos;

import lombok.Data;

@Data
public class MovimentacoesDTO {
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

package arenaiq.consulta.core.dtos;

import lombok.Data;

@Data
public class PartidasDTO {
  private String id;
  private String data;
  private String local;
  private String casa;
  private String visitante;
  private Byte placarC;
  private Byte placarV;
  private String competicao;
}

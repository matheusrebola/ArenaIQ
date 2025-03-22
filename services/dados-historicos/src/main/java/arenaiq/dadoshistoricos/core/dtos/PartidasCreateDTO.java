package arenaiq.dadoshistoricos.core.dtos;

import lombok.Data;

@Data
public class PartidasCreateDTO {
  private String data;
  private String local;
  private String casa;
  private String visitante;
  private Byte placarC;
  private Byte placarV;
  private String competicao;
}

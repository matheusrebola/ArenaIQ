package arenaiq.consulta.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.consulta.core.models.enums.EEvento;
import arenaiq.consulta.core.models.enums.EMotivo;
import lombok.Data;

@Document
@Data
public class Eventos {
  @Id
  private String id;
  private EEvento evento;
  private EMotivo motivo;
  private Byte minuto;
  private Byte segundo;
  private Float posicaoX;
  private Float posicaoY;
  private String jogadorId;
  private String partidaId;
  private String detalheId;
}

package arenaiq.recebidor.evento.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

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
  @DBRef
  private DetalhesEvento detalhes;
}

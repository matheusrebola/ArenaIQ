package arenaiq.encaminhador.evento.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "eventos")
public class Eventos {
  @Id
  private String id;
  private EEvento evento;
  private EMotivo motivo;
  private String partidaId;
  private String origem; //jogador de origem
  private String destino; //jogador destino
  private Byte minuto;
  private Byte segundo;
  private Float posicaoX;
  private Float posicaoY;
  private Float distancia;
}

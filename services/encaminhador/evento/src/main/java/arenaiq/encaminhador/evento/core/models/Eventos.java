package arenaiq.encaminhador.evento.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.encaminhador.evento.core.models.enums.EAtor;
import arenaiq.encaminhador.evento.core.models.enums.EEvento;
import arenaiq.encaminhador.evento.core.models.enums.EMotivo;
import arenaiq.encaminhador.evento.core.models.enums.EQualidade;
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
  private EQualidade qualidade;
  private String partidaId;
  private String origem; //jogador de origem
  private String destino; //jogador destino
  private Byte minuto;
  private Byte segundo;
  private EAtor posicaoX;
  private EAtor posicaoY;
}

package arenaiq.encaminhador.evento.core.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "acontecimentos")
public class Acontecimentos {
  @Id
  private String id;
  private String transacaoId;
  private String eventoId;
  private Eventos payload;
  private String source;
  private ESagaStatus status;
  private LocalDateTime criacao;
}

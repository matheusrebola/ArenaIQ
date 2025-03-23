package arenaiq.encaminhador.evento.core.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Historia {
  private String source;
  private ESagaStatus status;
  private String message;
  private LocalDateTime createdAt;
}

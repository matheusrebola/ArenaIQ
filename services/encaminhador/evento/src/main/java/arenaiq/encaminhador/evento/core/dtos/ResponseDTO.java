package arenaiq.encaminhador.evento.core.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class ResponseDTO {
    private UUID id;
    private LocalDateTime data;
}

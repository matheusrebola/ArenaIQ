package arenaiq.encaminhador.evento.core.producers;

import arenaiq.encaminhador.evento.core.dtos.EventoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class SagaProducer {
  private final KafkaTemplate<String, String> kafkaTemplate;

  @Value("${spring.kafka.topic.eventos-start}")
  private String eventosStartTopic;

  public void enviarAcontecimento(EventoDTO payload) {
        try {
            log.info("Sending event to topic {} with data {}", eventosStartTopic, payload);
            kafkaTemplate.send(eventosStartTopic, payload.toString());
        } catch (Exception ex) {
            log.error("Error trying to send data to topic {} with data {}", eventosStartTopic, payload, ex);
        }
    }
}

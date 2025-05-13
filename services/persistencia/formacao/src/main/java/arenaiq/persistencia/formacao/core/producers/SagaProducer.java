package arenaiq.persistencia.formacao.core.producers;

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

  public void enviarAcontecimento(String payload) {
        try {
            log.info("Sending event to topic {} with data {}", eventosStartTopic, payload);
            kafkaTemplate.send(eventosStartTopic, payload);
        } catch (Exception ex) {
            log.error("Error trying to send data to topic {} with data {}", eventosStartTopic, payload, ex);
        }
    }
}

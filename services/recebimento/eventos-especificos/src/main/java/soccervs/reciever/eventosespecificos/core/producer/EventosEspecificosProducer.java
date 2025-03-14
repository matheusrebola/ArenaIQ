package soccervs.reciever.eventosespecificos.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventosEspecificosProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public EventosEspecificosProducer(KafkaTemplate<String, String> kafkaTemplate) {this.kafkaTemplate = kafkaTemplate;}

	@Value("${spring.kafka.topic.eventos-especificos-start}")
    private String eventosEspecificosStartTopic;

	public void sendEvent(String payload) {
		kafkaTemplate.send(eventosEspecificosStartTopic, payload);
	}
}

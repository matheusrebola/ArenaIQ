package soccervs.reciever.eventos.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventosProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public EventosProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	@Value("${spring.kafka.topic.eventos-start}")
    private String eventosStartTopic;

	public void sendEvent(String payload) {
		kafkaTemplate.send(eventosStartTopic, payload);
	}
}

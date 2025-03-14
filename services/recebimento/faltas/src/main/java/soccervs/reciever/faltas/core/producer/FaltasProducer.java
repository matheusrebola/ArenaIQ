package soccervs.reciever.faltas.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class FaltasProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public FaltasProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	@Value("${spring.kafka.topic.faltas-start}")
	private String faltasStartTopic;

	public void sendEvent(String payload) {
		kafkaTemplate.send(faltasStartTopic, payload);
	}
}

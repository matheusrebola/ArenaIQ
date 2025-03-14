package soccervs.reciever.linhadefensiva.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class LinhaDefensivaProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public LinhaDefensivaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@Value("${spring.kafka.topic.linha-defensiva-start}")
    private String linhaDefensivaStartTopic;
	
	public void sendEvent(String payload) {
		kafkaTemplate.send(linhaDefensivaStartTopic, payload);
	}
}

package soccervs.reciever.formacao.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class FormacaoTimeProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public FormacaoTimeProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@Value("${spring.kafka.topic.formacao-time-start}")
    private String formacaoTimeStartTopic;
	
	public void sendEvent(String payload) {
		kafkaTemplate.send(formacaoTimeStartTopic, payload);
	}
}

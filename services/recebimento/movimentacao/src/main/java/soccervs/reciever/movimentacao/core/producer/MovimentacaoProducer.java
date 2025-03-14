package soccervs.reciever.movimentacao.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MovimentacaoProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public MovimentacaoProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@Value("${spring.kafka.topic.movimentacao-start}")
    private String movimentacaoStartTopic;
	
	public void sendEvent(String payload) {
		kafkaTemplate.send(movimentacaoStartTopic, payload);
	}
}

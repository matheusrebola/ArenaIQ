package soccervs.reciever.finalizacoes.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class FinalizacoesProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public FinalizacoesProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	@Value("${spring.kafka.topic.finalizacoes-start}")
	private String finalizacoesStartTopic;

	public void sendEvent(String payload) {
		kafkaTemplate.send(finalizacoesStartTopic, payload);
	}
}

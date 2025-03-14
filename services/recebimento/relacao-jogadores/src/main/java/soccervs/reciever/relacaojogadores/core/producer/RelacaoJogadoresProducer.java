package soccervs.reciever.relacaojogadores.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class RelacaoJogadoresProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public RelacaoJogadoresProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@Value("${spring.kafka.topic.relacao-jogadores-start}")
    private String relacaoJogadoresStartTopic;
	
	public void sendEvent(String payload) {
		kafkaTemplate.send(relacaoJogadoresStartTopic, payload);
	}
}

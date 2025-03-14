package soccervs.reciever.cartoes.core.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CartoesProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;
	
    public CartoesProducer(KafkaTemplate<String, String> kafkaTemplate) {this.kafkaTemplate = kafkaTemplate;}

    @Value("${spring.kafka.topic.cartoes-start}")
    private String cartoesStartTopic;

    public void sendEvent(String payload) {
            kafkaTemplate.send(cartoesStartTopic, payload);
    }
}

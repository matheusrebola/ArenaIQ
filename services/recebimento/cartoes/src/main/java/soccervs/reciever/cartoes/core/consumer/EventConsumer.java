package soccervs.reciever.cartoes.core.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import soccervs.reciever.cartoes.core.services.EventService;
import soccervs.reciever.cartoes.core.utils.JsonUtil;

@Component
public class EventConsumer {
	private final EventService service;
	private final JsonUtil jsonUtil;

	public EventConsumer(EventService service, JsonUtil jsonUtil) {
		super();
		this.service = service;
		this.jsonUtil = jsonUtil;
	}

	@KafkaListener(
			groupId = "${spring.kafka.consumer.group-id}", 
			topics = "${spring.kafka.topic.cartoes-ending}")
	public void consumeNotifyEndingEvent(String payload) {
		var event = jsonUtil.toEvent(payload);
		service.notifyEnding(event);
	}
}

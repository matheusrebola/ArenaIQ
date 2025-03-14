package soccervs.reciever.eventos.core.consumer;

import org.springframework.kafka.annotation.KafkaListener;

import soccervs.reciever.eventos.core.services.EventService;
import soccervs.reciever.eventos.core.utils.JsonUtil;

public class EventosConsumer {

	private final EventService service;
	private final JsonUtil jsonUtil;

	public EventosConsumer(EventService service, JsonUtil jsonUtil) {
		super();
		this.service = service;
		this.jsonUtil = jsonUtil;
	}

	@KafkaListener(groupId = "${spring.kafka.consumer.group-id}", topics = "${spring.kafka.topic.eventos-ending}")
	public void consumeNotifyEndingEvent(String payload) {
		var event = jsonUtil.toEvent(payload);
		service.notifyEnding(event);
	}
}

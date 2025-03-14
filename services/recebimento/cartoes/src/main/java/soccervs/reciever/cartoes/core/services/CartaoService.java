package soccervs.reciever.cartoes.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.cartoes.core.documents.Cartoes;
import soccervs.reciever.cartoes.core.producer.CartoesProducer;
import soccervs.reciever.cartoes.core.repositories.CartoesRepository;
import soccervs.reciever.cartoes.core.utils.JsonUtil;

@Service
public class CartaoService {

	private final CartoesRepository repository;
	private final EventService eventService;
	private final CartoesProducer producer;
	private final JsonUtil jsonUtil;

	public CartaoService(CartoesRepository repository, EventService eventService, CartoesProducer producer,
			JsonUtil jsonUtil) {
		super();
		this.repository = repository;
		this.eventService = eventService;
		this.producer = producer;
		this.jsonUtil = jsonUtil;
	}

	public Cartoes createCartao(Cartoes cartaoRequest) {
		var saved = salvar(cartaoRequest);
		String cartaoId = saved.getId();
		producer.sendEvent(jsonUtil.toJson(eventService.createEvent(cartaoId)));
		return saved;
	}

	public Cartoes salvar(Cartoes c) {
		return repository.save(c);
	}

	public List<Cartoes> encotrarTodos() {
		return repository.findAll();
	}

}

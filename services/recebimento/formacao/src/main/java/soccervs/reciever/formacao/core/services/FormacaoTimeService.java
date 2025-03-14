package soccervs.reciever.formacao.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.formacao.core.documents.FormacaoTime;
import soccervs.reciever.formacao.core.repositories.FormacaoTimeRepository;

@Service
public class FormacaoTimeService {

	private final FormacaoTimeRepository repository;

	public FormacaoTimeService(FormacaoTimeRepository repository) {this.repository = repository;}

	public FormacaoTime salvar(FormacaoTime formacaoTime) {
		return repository.save(formacaoTime);
	}

	public List<FormacaoTime> encontrarTodos() {
		return repository.findAll();
	}

}

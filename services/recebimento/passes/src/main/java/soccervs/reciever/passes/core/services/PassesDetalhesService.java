package soccervs.reciever.passes.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.passes.core.documents.PassesDetalhes;
import soccervs.reciever.passes.core.repositories.PassesDetalhesRepository;

@Service
public class PassesDetalhesService {

	private final PassesDetalhesRepository repository;

	public PassesDetalhesService(PassesDetalhesRepository repository) {
		super();
		this.repository = repository;
	}

	public PassesDetalhes salvar(PassesDetalhes passesDetalhes) {
		return repository.save(passesDetalhes);
	}

	public List<PassesDetalhes> encontrarTodos() {
		return repository.findAll();
	}
	
	
}

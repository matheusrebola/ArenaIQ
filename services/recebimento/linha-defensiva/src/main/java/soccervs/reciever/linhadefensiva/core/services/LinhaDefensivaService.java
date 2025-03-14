package soccervs.reciever.linhadefensiva.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.linhadefensiva.core.documents.LinhaDefensiva;
import soccervs.reciever.linhadefensiva.core.repositories.LinhaDefensivaRepository;

@Service
public class LinhaDefensivaService {

	private final LinhaDefensivaRepository repository;

	public LinhaDefensivaService(LinhaDefensivaRepository repository) {this.repository = repository;}

	public LinhaDefensiva salvar(LinhaDefensiva linhaDefensiva) {
		return repository.save(linhaDefensiva);
	}

	public List<LinhaDefensiva> encontrarTodos() {
		return repository.findAll();
	}
	
	
}

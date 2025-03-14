package soccervs.reciever.faltas.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.faltas.core.documents.Faltas;
import soccervs.reciever.faltas.core.repositories.FaltasRepository;

@Service
public class FaltasService {

	private final FaltasRepository repository;

	public FaltasService(FaltasRepository repository) {this.repository = repository;}

	public Faltas salvar(Faltas falta) {
		return repository.save(falta);
	}

	public List<Faltas> encontrarTodos() {
		return repository.findAll();
	}
	
	
}

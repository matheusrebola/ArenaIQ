package soccervs.statics.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccervs.statics.core.entities.Partidas;
import soccervs.statics.core.repositories.PartidaRepository;

@Service
public class PartidasService {

	@Autowired
	private PartidaRepository repository;

	public Partidas salvar(Partidas p) {
		return repository.save(p);
	}
}

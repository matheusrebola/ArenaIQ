package soccervs.reciever.relacaojogadores.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.relacaojogadores.core.documents.RelacaoJogadores;
import soccervs.reciever.relacaojogadores.core.repositories.RelacaoJogadoresRepository;

@Service
public class RelacaoJogadoresService {

	private final RelacaoJogadoresRepository repository;

	public RelacaoJogadoresService(RelacaoJogadoresRepository repository) {
		super();
		this.repository = repository;
	}

	public RelacaoJogadores salvar(RelacaoJogadores relacao) {
		return repository.save(relacao);
	}

	public List<RelacaoJogadores> encontrarTodos() {
		return repository.findAll();
	}

}

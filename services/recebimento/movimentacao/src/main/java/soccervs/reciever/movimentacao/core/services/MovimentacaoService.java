package soccervs.reciever.movimentacao.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.movimentacao.core.documents.Movimentacao;
import soccervs.reciever.movimentacao.core.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {

	private final MovimentacaoRepository repository;

	public MovimentacaoService(MovimentacaoRepository repository) {
		super();
		this.repository = repository;
	}

	public Movimentacao salvar(Movimentacao movimentacao) {
		return repository.save(movimentacao);
	}

	public List<Movimentacao> encontrarTodos() {
		return repository.findAll();
	}
}

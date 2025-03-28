package arenaiq.encaminhador.movimentacao.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.encaminhador.movimentacao.core.models.Movimentacoes;

@Repository
public interface MovimentacaoRepository extends MongoRepository<Movimentacoes, String> {

}

package arenaiq.recebidor.movimentacao.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.movimentacao.core.models.Movimentacoes;

@Repository
public interface MovimentacaoRepository extends MongoRepository<Movimentacoes, String> {

}

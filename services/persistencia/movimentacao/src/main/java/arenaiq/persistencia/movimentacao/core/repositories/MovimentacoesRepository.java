package arenaiq.persistencia.movimentacao.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.movimentacao.core.models.Movimentacoes;

@Repository
public interface MovimentacoesRepository extends MongoRepository<Movimentacoes, String> {

}

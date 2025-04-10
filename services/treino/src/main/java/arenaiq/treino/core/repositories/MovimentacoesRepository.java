package arenaiq.treino.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.treino.core.models.Movimentacoes;

@Repository
public interface MovimentacoesRepository extends MongoRepository<Movimentacoes, String>{

}

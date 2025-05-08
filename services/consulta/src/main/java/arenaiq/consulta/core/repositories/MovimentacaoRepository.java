package arenaiq.consulta.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Movimentacoes;

@Repository
public interface MovimentacaoRepository extends MongoRepository<Movimentacoes, String> {
}

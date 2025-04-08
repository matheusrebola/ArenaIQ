package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Posicoes;

@Repository
public interface PosicoesRepository extends MongoRepository<Posicoes, String>{

}

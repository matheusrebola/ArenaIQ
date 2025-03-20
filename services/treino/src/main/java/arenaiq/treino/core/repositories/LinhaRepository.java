package arenaiq.treino.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.treino.core.models.Linhas;

@Repository
public interface LinhaRepository extends MongoRepository<Linhas, String>{

}

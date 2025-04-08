package arenaiq.persistencia.linha.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.linha.core.models.Linhas;

@Repository
public interface LinhaRepository extends MongoRepository<Linhas, String>{

}

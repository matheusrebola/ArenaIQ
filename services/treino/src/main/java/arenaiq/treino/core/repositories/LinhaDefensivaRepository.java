package arenaiq.treino.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.treino.core.models.LinhaDefensiva;

@Repository
public interface LinhaDefensivaRepository extends MongoRepository<LinhaDefensiva, String>{

}

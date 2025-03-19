package arenaiq.recebidor.linhadefensiva.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.linhadefensiva.core.models.LinhaDefensiva;

@Repository
public interface LinhaDefensivaRepositories extends MongoRepository<LinhaDefensiva, String> {

}

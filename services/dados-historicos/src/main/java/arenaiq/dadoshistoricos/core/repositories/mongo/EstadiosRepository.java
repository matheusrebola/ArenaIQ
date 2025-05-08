package arenaiq.dadoshistoricos.core.repositories.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.document.Estadios;

@Repository
public interface EstadiosRepository extends MongoRepository<Estadios, String>{

}

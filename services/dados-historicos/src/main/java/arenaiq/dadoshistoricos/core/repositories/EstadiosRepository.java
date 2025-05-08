package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Estadios;

@Repository
public interface EstadiosRepository extends MongoRepository<Estadios, String>{

}

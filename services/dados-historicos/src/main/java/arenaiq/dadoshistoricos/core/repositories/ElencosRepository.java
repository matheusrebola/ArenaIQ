package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Elencos;

@Repository
public interface ElencosRepository extends MongoRepository<Elencos, String>{

}

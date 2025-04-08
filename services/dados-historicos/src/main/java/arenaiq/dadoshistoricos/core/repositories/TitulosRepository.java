package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Titulos;

@Repository
public interface TitulosRepository extends MongoRepository<Titulos, String>{

}

package arenaiq.dadoshistoricos.core.repositories.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.document.Titulos;

@Repository
public interface TitulosRepository extends MongoRepository<Titulos, String>{

}

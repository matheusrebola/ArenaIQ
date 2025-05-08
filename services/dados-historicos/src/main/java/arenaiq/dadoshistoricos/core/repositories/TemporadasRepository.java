package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Temporadas;

@Repository
public interface TemporadasRepository extends MongoRepository<Temporadas, String>{

}

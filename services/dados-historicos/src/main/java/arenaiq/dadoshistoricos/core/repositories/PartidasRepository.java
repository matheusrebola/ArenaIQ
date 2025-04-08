package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Partidas;

@Repository
public interface PartidasRepository extends MongoRepository<Partidas, String>{

}

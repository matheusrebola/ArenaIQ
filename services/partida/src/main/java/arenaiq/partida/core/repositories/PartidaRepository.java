package arenaiq.partida.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.partida.core.models.Partida;

@Repository
public interface PartidaRepository extends MongoRepository<Partida, String>{

}

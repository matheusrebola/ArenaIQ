package arenaiq.encaminhador.partida.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.encaminhador.partida.core.models.Partidas;

@Repository
public interface PartidaRepository extends MongoRepository<Partidas, String> {

}

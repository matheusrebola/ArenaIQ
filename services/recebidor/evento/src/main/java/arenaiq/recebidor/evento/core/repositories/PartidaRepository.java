package arenaiq.recebidor.evento.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.evento.core.models.Partida;

@Repository
public interface PartidaRepository extends Neo4jRepository<Partida, String> {

}

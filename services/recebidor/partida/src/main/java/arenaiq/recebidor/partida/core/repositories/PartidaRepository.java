package arenaiq.recebidor.partida.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.partida.core.models.Partidas;

@Repository
public interface PartidaRepository extends Neo4jRepository<Partidas, String> {

}

package arenaiq.recebidor.evento.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.evento.core.models.Ator;
import arenaiq.recebidor.evento.core.models.enums.EAtor;

@Repository
public interface AtorRepository extends Neo4jRepository<Ator, EAtor> {

}

package arenaiq.recebidor.evento.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.evento.core.models.Evento;
import arenaiq.recebidor.evento.core.models.enums.EEvento;

@Repository
public interface EventoRepository extends Neo4jRepository<Evento, EEvento> {

}

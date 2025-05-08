package arenaiq.recebidor.evento.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.evento.core.models.Motivo;
import arenaiq.recebidor.evento.core.models.enums.EMotivo;

@Repository
public interface MotivoRepository extends Neo4jRepository<Motivo, EMotivo> {

}

package arenaiq.recebidor.evento.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.evento.core.models.Qualidade;
import arenaiq.recebidor.evento.core.models.enums.EQualidade;

@Repository
public interface QualidadeRepository extends Neo4jRepository<Qualidade, EQualidade> {

}

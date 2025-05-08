package arenaiq.recebidor.formacao.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.formacao.core.models.ModoJogo;
import arenaiq.recebidor.formacao.core.models.enums.EModoJogo;

@Repository
public interface ModoJogoRepository extends Neo4jRepository<ModoJogo, EModoJogo> {

}

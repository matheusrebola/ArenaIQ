package arenaiq.recebidor.formacao.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.formacao.core.models.Formacoes;

@Repository
public interface FormacoesRepository extends Neo4jRepository<Formacoes, String> {

}

package arenaiq.recebidor.formacao.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.formacao.core.models.Compacatacao;
import arenaiq.recebidor.formacao.core.models.enums.ECompacatacao;

@Repository
public interface CompactacaoRepository extends Neo4jRepository<Compacatacao, ECompacatacao> {

}

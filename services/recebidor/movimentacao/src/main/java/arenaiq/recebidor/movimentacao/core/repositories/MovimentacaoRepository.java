package arenaiq.recebidor.movimentacao.core.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.movimentacao.core.models.Movimentacoes;

@Repository
public interface MovimentacaoRepository extends Neo4jRepository<Movimentacoes, String> {

}

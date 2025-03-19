package arenaiq.persistencia.movimentacao.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.movimentacao.core.models.Movimentacoes;

@Repository
public interface MovimentacaoRepository extends CassandraRepository<Movimentacoes, String> {

}

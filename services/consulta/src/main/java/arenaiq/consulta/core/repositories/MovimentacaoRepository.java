package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Movimentacoes;

@Repository
public interface MovimentacaoRepository extends CassandraRepository<Movimentacoes, String> {

}

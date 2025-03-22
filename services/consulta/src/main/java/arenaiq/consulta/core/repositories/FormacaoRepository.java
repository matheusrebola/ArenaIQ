package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Formacoes;

@Repository
public interface FormacaoRepository extends CassandraRepository<Formacoes, String> {

}

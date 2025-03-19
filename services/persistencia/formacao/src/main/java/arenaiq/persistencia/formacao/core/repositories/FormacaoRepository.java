package arenaiq.persistencia.formacao.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.formacao.core.models.Formacoes;

@Repository
public interface FormacaoRepository extends CassandraRepository<Formacoes, String> {

}

package arenaiq.persistencia.linha.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.linha.core.models.Linhas;

@Repository
public interface LinhaRepository extends CassandraRepository<Linhas, String>{

}

package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Linhas;

@Repository
public interface LinhaRepository extends CassandraRepository<Linhas, String>{

}

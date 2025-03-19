package arenaiq.persistencia.linhadefensiva.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.linhadefensiva.core.models.LinhaDefensiva;

@Repository
public interface LinhaDefensivaRepositories extends CassandraRepository<LinhaDefensiva, String> {

}

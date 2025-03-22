package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Eventos;

@Repository
public interface EventosRepositories extends CassandraRepository<Eventos, String> {

}

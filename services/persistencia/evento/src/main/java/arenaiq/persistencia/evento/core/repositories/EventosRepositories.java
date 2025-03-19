package arenaiq.persistencia.evento.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.evento.core.models.Eventos;

@Repository
public interface EventosRepositories extends CassandraRepository<Eventos, String> {

}

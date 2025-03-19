package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Temporadas;

@Repository
public interface TemporadasRepository extends CassandraRepository<Temporadas, String>{

}

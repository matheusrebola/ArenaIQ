package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Temporadas;

@Repository
public interface TemporadasRepository extends CassandraRepository<Temporadas, String>{

}

package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Partidas;

@Repository
public interface PartidasRepository extends CassandraRepository<Partidas, String>{

}

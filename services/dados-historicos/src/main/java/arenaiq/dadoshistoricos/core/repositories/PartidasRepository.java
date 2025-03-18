package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Partidas;

@Repository
public interface PartidasRepository extends CassandraRepository<Partidas, String>{

}

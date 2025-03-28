package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Elencos;

@Repository
public interface ElencosRepository extends CassandraRepository<Elencos, String>{

}

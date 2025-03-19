package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Tecnicos;

@Repository
public interface TecnicosRepository extends CassandraRepository<Tecnicos, String>{

}

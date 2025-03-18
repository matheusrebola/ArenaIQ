package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Tecnicos;

@Repository
public interface TecnicosRepository extends CassandraRepository<Tecnicos, String>{

}

package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Titulos;

@Repository
public interface TitulosRepository extends CassandraRepository<Titulos, String>{

}

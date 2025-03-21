package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.JogadoresElenco;

@Repository
public interface JogadoresElencoRepository extends CassandraRepository<JogadoresElenco, String>{

}

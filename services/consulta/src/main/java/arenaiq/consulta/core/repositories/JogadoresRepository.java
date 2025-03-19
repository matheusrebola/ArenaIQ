package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Jogadores;

@Repository
public interface JogadoresRepository extends CassandraRepository<Jogadores, String>{

}

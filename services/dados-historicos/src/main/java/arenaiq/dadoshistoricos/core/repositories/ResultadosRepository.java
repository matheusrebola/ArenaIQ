package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Resultados;

@Repository
public interface ResultadosRepository extends CassandraRepository<Resultados, String>{

}

package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Posicoes;

@Repository
public interface PosicoesRepository extends CassandraRepository<Posicoes, String>{

}

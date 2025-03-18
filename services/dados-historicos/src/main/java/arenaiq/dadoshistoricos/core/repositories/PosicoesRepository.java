package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Posicoes;

@Repository
public interface PosicoesRepository extends CassandraRepository<Posicoes, String>{

}

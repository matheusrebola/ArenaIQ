package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Competicoes;

@Repository
public interface CompeticoesRepository extends CassandraRepository<Competicoes, String>{

}

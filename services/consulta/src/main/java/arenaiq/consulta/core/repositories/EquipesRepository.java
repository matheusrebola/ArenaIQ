package arenaiq.consulta.core.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Equipes;

@Repository
public interface EquipesRepository extends CassandraRepository<Equipes, String>{

}

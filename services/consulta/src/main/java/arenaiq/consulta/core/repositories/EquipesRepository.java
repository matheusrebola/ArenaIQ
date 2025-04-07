package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Equipes;

@Repository
public interface EquipesRepository extends CassandraRepository<Equipes, String>{
  List<Equipes> findByNome(String n);
  List<Equipes> findByCidade(String c);
  List<Equipes> findByPais(String p);
  List<Equipes> findByAnoFundacao(String a);
}

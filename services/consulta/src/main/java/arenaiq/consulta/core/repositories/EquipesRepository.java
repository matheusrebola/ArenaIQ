package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Equipes;

@Repository
public interface EquipesRepository extends MongoRepository<Equipes, String>{
  List<Equipes> findByNome(String n);
  List<Equipes> findByCidade(String c);
  List<Equipes> findByPais(String p);
  List<Equipes> findByAnoFundacao(String a);
}

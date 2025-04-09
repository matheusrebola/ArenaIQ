package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Elencos;

@Repository
public interface ElencosRepository extends MongoRepository<Elencos, String>{
  List<Elencos> findByApelido(String a);
  List<Elencos> findByEquipe(String e);
  List<Elencos> findByTecnico(String t);
}

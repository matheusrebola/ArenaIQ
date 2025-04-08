package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Temporadas;

@Repository
public interface TemporadasRepository extends MongoRepository<Temporadas, String>{
  List<Temporadas> findByTemporada(String t);
  List<Temporadas> findByDataInicio(String i);
  List<Temporadas> findByDataFim(String f);
}

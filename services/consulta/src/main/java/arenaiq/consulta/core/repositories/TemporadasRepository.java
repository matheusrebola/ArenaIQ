package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Temporadas;

@Repository
public interface TemporadasRepository extends CassandraRepository<Temporadas, String>{
  List<Temporadas> findByTemporada(String t);
  List<Temporadas> findByDataInicio(String i);
  List<Temporadas> findByDataFim(String f);
}

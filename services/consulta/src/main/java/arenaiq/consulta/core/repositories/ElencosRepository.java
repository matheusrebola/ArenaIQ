package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Elencos;

@Repository
public interface ElencosRepository extends CassandraRepository<Elencos, String>{
  List<Elencos> findByEquipe(String e);
  List<Elencos> findByApelido(String a);
  List<Elencos> findByTecnico(String t);
}

package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Tecnicos;
import arenaiq.consulta.core.models.enums.EFilosofia;

@Repository
public interface TecnicosRepository extends CassandraRepository<Tecnicos, String>{
  List<Tecnicos> findByNome(String n);
  List<Tecnicos> findByNacionalidade(String n);
  List<Tecnicos> findByDataNascimento(String d);
  List<Tecnicos> findByAnosExperiencia(Byte a);
  List<Tecnicos> findByFilosofia(EFilosofia f);
}

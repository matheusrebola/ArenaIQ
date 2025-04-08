package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Tecnicos;
import arenaiq.consulta.core.models.enums.EFilosofia;

@Repository
public interface TecnicosRepository extends MongoRepository<Tecnicos, String>{
  List<Tecnicos> findByNome(String n);
  List<Tecnicos> findByNacionalidade(String n);
  List<Tecnicos> findByDataNascimento(String d);
  List<Tecnicos> findByAnosExperiencia(Byte a);
  List<Tecnicos> findByFilosofia(EFilosofia f);
}

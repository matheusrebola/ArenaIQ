package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Titulos;
import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EParticipante;

@Repository
public interface TitulosRepository extends MongoRepository<Titulos, String>{
  List<Titulos> findByNome(String n);
  List<Titulos> findByParticipante(EParticipante p);
  List<Titulos> findByTemporada(String t);
  List<Titulos> findByPosicao(String p);
  List<Titulos> findByMvp(String m);
  List<Titulos> findByTipoTitulo(ECompeticao c);
  List<Titulos> findByEquipe(String e);
  List<Titulos> findByCompeticao(String c);
}

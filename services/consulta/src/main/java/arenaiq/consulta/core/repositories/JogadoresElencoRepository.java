package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.JogadoresElenco;

@Repository
public interface JogadoresElencoRepository extends MongoRepository<JogadoresElenco, String>{
  List<JogadoresElenco> findByElenco(String e);
  List<JogadoresElenco> findByTemporada(String t);
  List<JogadoresElenco> findByJogador(String j);
}

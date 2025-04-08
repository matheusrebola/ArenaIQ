package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.JogadoresElenco;

@Repository
public interface JogadoresElencoRepository extends MongoRepository<JogadoresElenco, String>{

}

package arenaiq.partida.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.partida.core.models.Jogador;

@Repository
public interface JogadorRepository extends MongoRepository<Jogador, String>{

}

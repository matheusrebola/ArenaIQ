package arenaiq.partida.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.partida.core.models.Jogadores;

@Repository
public interface JogadorRepository extends MongoRepository<Jogadores, String>{
  List<Jogadores> findByClube(String clube);
}

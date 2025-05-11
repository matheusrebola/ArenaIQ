package arenaiq.partida.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import arenaiq.partida.core.models.Jogadores;

@Repository
public interface JogadorRepository extends MongoRepository<Jogadores, String>{
  @Query("{ 'elenco': { $elemMatch: { 'clube': ?0, 'entrada': { $lte: ?1 }, 'saida': { $gte: ?1 } } } }")
  List<Jogadores> findByClubeAndTemporada(String clube, String temporada);
}

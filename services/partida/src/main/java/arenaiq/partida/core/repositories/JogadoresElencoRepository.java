package arenaiq.partida.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.partida.core.dtos.JogadorDTO;
import arenaiq.partida.core.models.JogadoresElenco;

@Repository
public interface JogadoresElencoRepository extends MongoRepository<JogadoresElenco, String>{

  List<JogadorDTO> findJogadorByElencoAndTemporada(String elenco, String temporada);

}

package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Resultados;

@Repository
public interface ResultadosRepository extends MongoRepository<Resultados, String>{

}

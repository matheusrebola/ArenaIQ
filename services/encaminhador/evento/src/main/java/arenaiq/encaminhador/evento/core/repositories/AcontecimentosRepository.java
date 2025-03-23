package arenaiq.encaminhador.evento.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.encaminhador.evento.core.models.Acontecimentos;

@Repository
public interface AcontecimentosRepository extends MongoRepository<Acontecimentos, String>{

}

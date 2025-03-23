package arenaiq.encaminhador.evento.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.encaminhador.evento.core.models.Eventos;

@Repository
public interface EventosRepository extends MongoRepository<Eventos, String> {

}

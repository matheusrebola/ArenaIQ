package arenaiq.persistencia.evento.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.evento.core.models.Eventos;

@Repository
public interface EventosRepository extends MongoRepository<Eventos, String> {

}

package arenaiq.recebidor.evento.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.evento.core.models.Eventos;

@Repository
public interface EventosRepositories extends MongoRepository<Eventos, String> {

}

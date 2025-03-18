package arenaiq.encaminhador.detalheevento.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.encaminhador.detalheevento.core.models.DetalhesEvento;

@Repository
public interface DetalhesEventoRepository extends MongoRepository<DetalhesEvento, String> {

}

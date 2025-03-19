package arenaiq.persistencia.detalheevento.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.detalheevento.models.DetalhesEvento;

@Repository
public interface DetalhesEventoRepository extends CassandraRepository<DetalhesEvento, String> {

}

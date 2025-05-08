package arenaiq.persistencia.evento.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.evento.core.models.Eventos;

@Repository
public interface EventosRepository extends JpaRepository<Eventos, String> {

}

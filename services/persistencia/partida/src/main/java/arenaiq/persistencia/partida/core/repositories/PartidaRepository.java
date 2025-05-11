package arenaiq.persistencia.partida.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.partida.core.models.Partidas;

@Repository
public interface PartidaRepository extends JpaRepository<Partidas, String> {

}

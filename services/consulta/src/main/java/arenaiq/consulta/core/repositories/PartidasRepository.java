package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Partidas;

@Repository
public interface PartidasRepository extends CassandraRepository<Partidas, String>{
  List<Partidas> findByDataHora(String d);
  List<Partidas> findByLocal(String l);
  List<Partidas> findByCasa(String c);
  List<Partidas> findByVisitante(String v);
  List<Partidas> findByPlacarC(Byte c);
  List<Partidas> findByPlacarV(Byte v);
  List<Partidas> findByCompeticao(String c);
}

package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.DetalhesEvento;

@Repository
public interface DetalhesEventoRepository extends CassandraRepository<DetalhesEvento, String> {
  List<DetalhesEvento> findByRPrimario(String p);
  List<DetalhesEvento> findByRSecundario(String p);
  List<DetalhesEvento> findByDistancia(Float d);
  List<DetalhesEvento> findByPressaoAdversaria(Boolean p);
  List<DetalhesEvento> findByNivelPressao(Float n);
}

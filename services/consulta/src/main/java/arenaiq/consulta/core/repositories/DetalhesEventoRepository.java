package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.DetalhesEvento;

@Repository
public interface DetalhesEventoRepository extends MongoRepository<DetalhesEvento, String> {
  List<DetalhesEvento> findByRPrimario(String p);
  List<DetalhesEvento> findByRSecundario(String p);
  List<DetalhesEvento> findByDistancia(Float d);
  List<DetalhesEvento> findByPressaoAdversaria(Boolean p);
  List<DetalhesEvento> findByNivelPressao(Float n);
}

package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Eventos;
import arenaiq.consulta.core.models.enums.EEvento;
import arenaiq.consulta.core.models.enums.EMotivo;

@Repository
public interface EventosRepository extends MongoRepository<Eventos, String> {
  List<Eventos> findByEvento(EEvento e);
  List<Eventos> findByMotivo(EMotivo m);
  List<Eventos> findByPartida(String p);
  List<Eventos> findByOrigem(String o);
  List<Eventos> findByDestino(String d);
  List<Eventos> findByMinuto(Byte m);
  List<Eventos> findBySegundo(Byte s);
  List<Eventos> findByPosicaoX(String x);
  List<Eventos> findByPosicaoY(String y);
}

package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Estadios;
import arenaiq.consulta.core.models.enums.EClima;
import arenaiq.consulta.core.models.enums.ECobertura;
import arenaiq.consulta.core.models.enums.EDrenagem;
import arenaiq.consulta.core.models.enums.EGrama;
import arenaiq.consulta.core.models.enums.EInclinacao;
import arenaiq.consulta.core.models.enums.EVento;

@Repository
public interface EstadiosRepository extends MongoRepository<Estadios, String>{
  List<Estadios> findByNome(String n);
  List<Estadios> findByCidade(String c);
  List<Estadios> findByPais(String p);
  List<Estadios> findByClubeMandante(String c);
  List<Estadios> findByCapacidade(String c);
  List<Estadios> findByGrama(EGrama g);
  List<Estadios> findByComprimento(Byte c);
  List<Estadios> findByLargura(Byte l);
  List<Estadios> findByCobertura(ECobertura c);
  List<Estadios> findByDrenagem(EDrenagem d);
  List<Estadios> findByInclinacao(EInclinacao i);
  List<Estadios> findByVento(EVento v);
  List<Estadios> findByClima(EClima c);
  List<Estadios> findByUltimoReparo(String u);
  List<Estadios> findByObservacoes(String o);
}

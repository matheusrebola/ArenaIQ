package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Resultados;

@Repository
public interface ResultadosRepository extends CassandraRepository<Resultados, String>{
  List<Resultados> findByJogosDisputados(Byte j);
  List<Resultados> findByVitorias(Byte v);
  List<Resultados> findByDerrotas(Byte d);
  List<Resultados> findByEmpates(Byte e);
  List<Resultados> findByAproveitamento(Float a);
  List<Resultados> findByGolsMarcados(Byte m);
  List<Resultados> findByGolsSofridos(Byte s);
  List<Resultados> findByDesempenho(Float d);
  List<Resultados> findByCompeticao(String c);
  List<Resultados> findByEquipe(String e);
  List<Resultados> findByTemporada(String t);
}

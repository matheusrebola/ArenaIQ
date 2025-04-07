package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Competicoes;
import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EDisputa;

@Repository
public interface CompeticoesRepository extends CassandraRepository<Competicoes, String>{
  List<Competicoes> findByNome(String n);
  List<Competicoes> findByTemporada(String t);
  List<Competicoes> findByCompeticao(ECompeticao c);
  List<Competicoes> findByDisputa(EDisputa d);
  List<Competicoes> findByLocalidade(String l);
}

package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Formacoes;
import arenaiq.consulta.core.models.enums.ECompacatacao;
import arenaiq.consulta.core.models.enums.EFormacao;
import arenaiq.consulta.core.models.enums.EModoJogo;

@Repository
public interface FormacaoRepository extends CassandraRepository<Formacoes, String> {
  List<Formacoes> findByMinuto(Byte m);
  List<Formacoes> findBySegundo(Byte s);
  List<Formacoes> findByFormacao(EFormacao f);
  List<Formacoes> findByModo(EModoJogo m);
  List<Formacoes> findByCompactacao(ECompacatacao compacatacao);
}

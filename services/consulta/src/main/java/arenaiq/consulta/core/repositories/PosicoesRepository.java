package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Posicoes;
import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EPosicao;

@Repository
public interface PosicoesRepository extends CassandraRepository<Posicoes, String>{
  List<Posicoes> findByPosicao(EPosicao p);
  List<Posicoes> findByFuncao(EFunPosicao f);
  List<Posicoes> findByDescricao(String d);
}

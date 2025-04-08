package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Movimentacoes;

@Repository
public interface MovimentacaoRepository extends MongoRepository<Movimentacoes, String> {
  List<Movimentacoes> findByEixoX(Float x);
  List<Movimentacoes> findByEixoY(Float y);
  List<Movimentacoes> findByVelocidade(Float v);
  List<Movimentacoes> findByAceleracao(Float a);
  List<Movimentacoes> findByMinuto(Byte m);
  List<Movimentacoes> findBySegundo(Byte s);
  List<Movimentacoes> findByPressao(Boolean p);
}

package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Posicoes;
import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EPosicao;

@Repository
public interface PosicoesRepository extends MongoRepository<Posicoes, String>{
  List<Posicoes> findByPosicao(EPosicao p);
  List<Posicoes> findByFuncao(EFunPosicao f);
  List<Posicoes> findByDescricao(String d);
}

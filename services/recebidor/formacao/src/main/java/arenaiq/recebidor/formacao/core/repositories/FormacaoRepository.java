package arenaiq.recebidor.formacao.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.recebidor.formacao.core.models.Formacoes;

@Repository
public interface FormacaoRepository extends MongoRepository<Formacoes, String> {

}

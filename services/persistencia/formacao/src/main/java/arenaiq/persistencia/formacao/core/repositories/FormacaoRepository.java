package arenaiq.persistencia.formacao.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.formacao.core.models.Formacoes;

@Repository
public interface FormacaoRepository extends MongoRepository<Formacoes, String> {

}

package arenaiq.encaminhador.formacao.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.encaminhador.formacao.core.models.Formacoes;

@Repository
public interface FormacaoRepository extends MongoRepository<Formacoes, String> {

}

package arenaiq.persistencia.formacao.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.formacao.core.models.Formacoes;

@Repository
public interface FormacoesRepository extends MongoRepository<Formacoes, String> {

}

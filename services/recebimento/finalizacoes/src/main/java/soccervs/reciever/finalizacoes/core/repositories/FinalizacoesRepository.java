package soccervs.reciever.finalizacoes.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.finalizacoes.core.documents.Finalizacoes;

@Repository
public interface FinalizacoesRepository extends MongoRepository<Finalizacoes, String> {

}

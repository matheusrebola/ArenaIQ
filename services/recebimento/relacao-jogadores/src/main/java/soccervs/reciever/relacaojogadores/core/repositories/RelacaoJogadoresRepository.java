package soccervs.reciever.relacaojogadores.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.relacaojogadores.core.documents.RelacaoJogadores;

@Repository
public interface RelacaoJogadoresRepository extends MongoRepository<RelacaoJogadores, String> {

}

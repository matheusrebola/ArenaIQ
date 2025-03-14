package soccervs.reciever.cartoes.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.cartoes.core.documents.Cartoes;

@Repository
public interface CartoesRepository extends MongoRepository<Cartoes, String> {

}

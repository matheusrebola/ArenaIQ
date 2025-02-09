package soccervs.reciever.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.core.documents.Cartoes;

@Repository
public interface CartoesRepository extends MongoRepository<Cartoes, Long> {

}

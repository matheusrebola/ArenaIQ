package soccervs.reciever.passes.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.passes.core.documents.PassesDetalhes;

@Repository
public interface PassesDetalhesRepository extends MongoRepository<PassesDetalhes, String> {

}

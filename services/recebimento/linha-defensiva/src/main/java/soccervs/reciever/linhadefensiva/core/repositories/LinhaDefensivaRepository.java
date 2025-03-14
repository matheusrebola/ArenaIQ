package soccervs.reciever.linhadefensiva.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.linhadefensiva.core.documents.LinhaDefensiva;

@Repository
public interface LinhaDefensivaRepository extends MongoRepository<LinhaDefensiva, String> {

}

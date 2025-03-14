package soccervs.reciever.eventosespecificos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.eventosespecificos.core.documents.EventosEspecificos;

@Repository
public interface EventosEspecificosRepository extends MongoRepository<EventosEspecificos, String> {

}

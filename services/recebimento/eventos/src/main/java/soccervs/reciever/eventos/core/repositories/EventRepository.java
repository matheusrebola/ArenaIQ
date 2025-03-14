package soccervs.reciever.eventos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.eventos.core.documents.Event;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {

}

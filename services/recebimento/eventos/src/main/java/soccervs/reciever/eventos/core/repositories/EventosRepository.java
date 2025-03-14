package soccervs.reciever.eventos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soccervs.reciever.eventos.core.documents.Eventos;

@Repository
public interface EventosRepository extends MongoRepository<Eventos, String> {

}

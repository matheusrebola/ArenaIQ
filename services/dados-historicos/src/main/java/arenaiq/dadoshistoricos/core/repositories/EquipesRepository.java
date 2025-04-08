package arenaiq.dadoshistoricos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.dadoshistoricos.core.models.Equipes;

@Repository
public interface EquipesRepository extends MongoRepository<Equipes, String>{

}

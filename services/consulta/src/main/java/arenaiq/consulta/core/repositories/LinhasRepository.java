package arenaiq.consulta.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Linhas;
import arenaiq.consulta.core.models.enums.ELargura;
import arenaiq.consulta.core.models.enums.EModoJogo;

@Repository
public interface LinhasRepository extends MongoRepository<Linhas, String>{
  List<Linhas> findByAltura(EModoJogo m);
  List<Linhas> findByLargura(ELargura l);
  List<Linhas> findByMinuto(Byte m);
  List<Linhas> findBySegundo(Byte s);
}

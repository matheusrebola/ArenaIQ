package arenaiq.persistencia.linha.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.linha.core.models.Linhas;

@Repository
public interface LinhasRepository extends JpaRepository<Linhas, String>{

}

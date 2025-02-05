package soccervs.statics.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soccervs.statics.core.entities.Tecnicos;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnicos, Integer> {
	@Query("SELECT t.id FROM Tecnicos t WHERE t = :tecnico")
	Integer findIdByTecnico(@Param("tecnico") Tecnicos tecnico);

}

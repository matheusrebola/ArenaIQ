package soccervs.persistence.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soccervs.persistence.core.entities.FormacaoTime;

@Repository
public interface FormacaoTimeRepository extends JpaRepository<FormacaoTime, Long> {

}

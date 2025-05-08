package arenaiq.persistencia.formacao.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.formacao.core.models.Formacoes;

@Repository
public interface FormacoesRepository extends JpaRepository<Formacoes, String> {

}

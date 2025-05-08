package arenaiq.persistencia.movimentacao.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arenaiq.persistencia.movimentacao.core.models.Movimentacoes;

@Repository
public interface MovimentacoesRepository extends JpaRepository<Movimentacoes, String> {

}

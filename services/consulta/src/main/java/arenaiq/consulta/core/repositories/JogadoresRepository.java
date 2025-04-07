package arenaiq.consulta.core.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import arenaiq.consulta.core.models.Jogadores;
import arenaiq.consulta.core.models.enums.EContribuicao;
import arenaiq.consulta.core.models.enums.EEstilo;
import arenaiq.consulta.core.models.enums.EFuncao;
import arenaiq.consulta.core.models.enums.EPe;
import arenaiq.consulta.core.models.enums.EPersonalidade;

@Repository
public interface JogadoresRepository extends CassandraRepository<Jogadores, String>{
  Jogadores findByNome(String n);
  List<Jogadores> findByDataNascimento(LocalDate d);
  List<Jogadores> findByNacionalidade(String n);
  List<Jogadores> findByFuncao(EFuncao f);
  List<Jogadores> findByContribuicao(EContribuicao c);
  List<Jogadores> findByEstilo(EEstilo e);
  List<Jogadores> findByPersonalidade(EPersonalidade p);
  List<Jogadores> findByEPe(EPe p);
  List<Jogadores> findByAltura(Float a);
  List<Jogadores> findByPeso(Float p);
  List<Jogadores> findByPosicao(String p);
}

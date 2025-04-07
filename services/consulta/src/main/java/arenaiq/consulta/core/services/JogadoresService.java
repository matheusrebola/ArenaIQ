package arenaiq.consulta.core.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Jogadores;
import arenaiq.consulta.core.models.enums.EContribuicao;
import arenaiq.consulta.core.models.enums.EEstilo;
import arenaiq.consulta.core.models.enums.EFuncao;
import arenaiq.consulta.core.models.enums.EPe;
import arenaiq.consulta.core.models.enums.EPersonalidade;
import arenaiq.consulta.core.repositories.JogadoresRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadoresService {
  private final JogadoresRepository r;

  public Jogadores findByNome(String n){
    return r.findByNome(n);
  }

  public List<Jogadores> findByDataNascimento(LocalDate d){
    return r.findByDataNascimento(d);
  }

  public List<Jogadores> findByNacionalidade(String n){
    return r.findByNacionalidade(n);
  }

  public List<Jogadores> findByFuncao(EFuncao f){
    return r.findByFuncao(f);
  }

  public List<Jogadores> findByContribuicao(EContribuicao c){
    return r.findByContribuicao(c);
  }

  public List<Jogadores> findByEstilo(EEstilo e){
    return r.findByEstilo(e);
  }

  public List<Jogadores> findByPersonalidade(EPersonalidade p){
    return r.findByPersonalidade(p);
  }

  public List<Jogadores> findByEPe(EPe p){
    return r.findByEPe(p);
  }

  public List<Jogadores> findByAltura(Float a){
    return r.findByAltura(a);
  }

  public List<Jogadores> findByPeso(Float p){
    return r.findByPeso(p);
  }

  public List<Jogadores> findByPosicao(String p){
    return r.findByPosicao(p);
  }
}

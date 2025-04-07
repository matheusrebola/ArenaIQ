package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Equipes;
import arenaiq.consulta.core.repositories.EquipesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EquipesService {
  private final EquipesRepository r;

  public List<Equipes> findByNome(String n){
    return r.findByNome(n);
  }

  public List<Equipes> findByCidade(String c){
    return r.findByCidade(c);
  }

  public List<Equipes> findByPais(String p){
    return r.findByPais(p);
  }

  public List<Equipes> findByAnoFundacao(String a){
    return r.findByAnoFundacao(a);
  }
}

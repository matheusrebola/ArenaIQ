package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Elencos;
import arenaiq.consulta.core.repositories.ElencosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ElencosService {
  private final ElencosRepository r;

  public List<Elencos> findAll(){
    return r.findAll();
  }

  public List<Elencos> findByEquipe(String e){
    return r.findByEquipe(e);
  }

  public List<Elencos> findByApelido(String a){
    return r.findByApelido(a);
  }

  public List<Elencos> findByTecnico(String t){
    return r.findByTecnico(t);
  }
}

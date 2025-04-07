package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Titulos;
import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EParticipante;
import arenaiq.consulta.core.repositories.TitulosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TitulosService {
  private final TitulosRepository r;

  public List<Titulos> findByNome(String n){
    return r.findByNome(n);
  }

  public List<Titulos> findByParticipante(EParticipante p){
    return r.findByParticipante(p);
  }

  public List<Titulos> findByTemporada(String t){
    return r.findByTemporada(t);
  }

  public List<Titulos> findByPosicao(String p){
    return r.findByPosicao(p);
  }

  public List<Titulos> findByMvp(String m){
    return r.findByMvp(m);
  }

  public List<Titulos> findByTipoTitulo(ECompeticao c){
    return r.findByTipoTitulo(c);
  }

  public List<Titulos> findByEquipe(String e){
    return r.findByEquipe(e);
  }

  public List<Titulos> findByCompeticao(String c){
    return r.findByCompeticao(c);
  }
}

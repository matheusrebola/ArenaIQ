package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Competicoes;
import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EDisputa;
import arenaiq.consulta.core.repositories.CompeticoesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompeticoesService {
  private final CompeticoesRepository r;

  public List<Competicoes> findByNome(String n){
    return r.findByNome(n);
  }

  public List<Competicoes> findByTemporada(String t){
    return r.findByTemporada(t);
  }

  public List<Competicoes> findByCompeticao(ECompeticao e){
    return r.findByCompeticao(e);
  }

  public List<Competicoes> findByDisputa(EDisputa d){
    return r.findByDisputa(d);
  }

  public List<Competicoes> findByLocalidade(String l){
    return r.findByLocalidade(l);
  }
}

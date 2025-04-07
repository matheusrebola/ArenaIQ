package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Linhas;
import arenaiq.consulta.core.models.enums.ELargura;
import arenaiq.consulta.core.models.enums.EModoJogo;
import arenaiq.consulta.core.repositories.LinhasRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LinhasService {
  private final LinhasRepository r;

  public List<Linhas> findAll(){
    return r.findAll();
  }

  public List<Linhas> findByAltura(EModoJogo m){
    return r.findByAltura(m);
  }

  public List<Linhas> findByLargura(ELargura l){
    return r.findByLargura(l);
  }

  public List<Linhas> findByMinuto(Byte m){
    return r.findByMinuto(m);
  }

  public List<Linhas> findBySegundo(Byte s){
    return r.findBySegundo(s);
  }
}

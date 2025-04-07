package arenaiq.consulta.core.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.Tecnicos;
import arenaiq.consulta.core.models.enums.EFilosofia;
import arenaiq.consulta.core.repositories.TecnicosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TecnicosService {
  private final TecnicosRepository r;

  public List<Tecnicos> findByNome(String n){
    return r.findByNome(n);
  }

  public List<Tecnicos> findByNacionalidade(String n){
    return r.findByNacionalidade(n);
  }

  public List<Tecnicos> findByDataNascimento(LocalDate d){
    return r.findByDataNascimento(d);
  }

  public List<Tecnicos> findByAnosExperiencia(Byte a){
    return r.findByAnosExperiencia(a);
  }

  public List<Tecnicos> findByFilosofia(EFilosofia f){
    return r.findByFilosofia(f);
  }
}

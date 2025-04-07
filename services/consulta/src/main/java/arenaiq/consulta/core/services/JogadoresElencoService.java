package arenaiq.consulta.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.consulta.core.models.JogadoresElenco;
import arenaiq.consulta.core.repositories.JogadoresElencoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadoresElencoService {
  private final JogadoresElencoRepository r;

  public List<JogadoresElenco> findByElenco(String e){
    return r.findByElenco(e);
  }

  public List<JogadoresElenco> findByTemporada(String t){
    return r.findByTemporada(t);
  }

  public List<JogadoresElenco> findByJogador(String j){
    return r.findByJogador(j);
  }
}

package arenaiq.partida.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.partida.core.models.Jogadores;
import arenaiq.partida.core.repositories.JogadorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadorService {
  private final JogadorRepository r;
  private final List<Jogadores> jogadores;
  
  public List<Jogadores> criarElencos(String c, String v, String t){
    jogadores.addAll(encontrarPorClubeETemporada(c, t));
    jogadores.addAll(encontrarPorClubeETemporada(v, t));
    return jogadores;
  }

  private List<Jogadores> encontrarPorClubeETemporada(String c, String t){
    return r.findByClubeAndTemporada(c, t);
  }

  public List<Jogadores> findAll(){
    return r.findAll();
  }

}

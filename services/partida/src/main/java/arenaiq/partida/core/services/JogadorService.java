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
  
  public List<Jogadores> criarElencosPorClube(String casa, String visitante){
    jogadores.addAll(r.findByClube(visitante));
    jogadores.addAll(r.findByClube(casa));
    return jogadores;
  }

  public List<Jogadores> findAll(){
    return r.findAll();
  }

}

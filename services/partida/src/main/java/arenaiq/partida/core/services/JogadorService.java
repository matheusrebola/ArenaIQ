package arenaiq.partida.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.partida.core.dtos.JogadoresDTO;
import arenaiq.partida.core.mappers.JogadorMapper;
import arenaiq.partida.core.models.Jogadores;
import arenaiq.partida.core.repositories.JogadorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadorService {
  private final JogadorRepository r;
  private final List<JogadoresDTO> jogadores;
  private final JogadorMapper mapper;
  
  public List<JogadoresDTO> criarElencos(String c, String v, String t){
    List<Jogadores> casa = encontrarPorClubeETemporada(c, t);
    List<Jogadores> visi = encontrarPorClubeETemporada(v, t);
    jogadores.addAll(mapper.map(casa,c));
    jogadores.addAll(mapper.map(visi,v));
    return jogadores;
  }

  private List<Jogadores> encontrarPorClubeETemporada(String c, String t){
    return r.findByClubeAndTemporada(c, t);
  }

  public List<Jogadores> findAll(){
    return r.findAll();
  }

}

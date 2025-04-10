package arenaiq.partida.core.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.partida.core.dtos.ElencosDTO;
import arenaiq.partida.core.mappers.JogadorMapper;
import arenaiq.partida.core.models.Jogadores;
import arenaiq.partida.core.repositories.JogadorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadorService {
  private final JogadorRepository r;
  private final JogadorMapper jMapper;
  
  public List<Jogadores> criarElencosPorClube(ElencosDTO e){
    List<Jogadores> jogadores = new ArrayList<>();

    // Jogadores do time da casa
    List<Jogadores> casa = r.findByClube(e.getCasa());
    jogadores.addAll(jMapper.map(casa, e.getPartida()));

    // Jogadores do time visitante
    List<Jogadores> visitante = r.findByClube(e.getVisitante());
    jogadores.addAll(jMapper.map(visitante, e.getPartida()));

    return jogadores;
  }

  public List<Jogadores> findAll(){
    return r.findAll();
  }

}

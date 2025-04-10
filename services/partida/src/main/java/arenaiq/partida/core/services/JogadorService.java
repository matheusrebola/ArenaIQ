package arenaiq.partida.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.partida.core.dtos.ElencosDTO;
import arenaiq.partida.core.dtos.JogadoresDTO;
import arenaiq.partida.core.mappers.JogadorMapper;
import arenaiq.partida.core.models.Jogadores;
import arenaiq.partida.core.repositories.JogadorRepository;
import arenaiq.partida.core.repositories.JogadoresElencoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadorService {
  private final JogadorRepository repository;
  private final JogadoresElencoRepository jERepository;
  private final JogadorMapper jMapper;
  private List<JogadoresDTO> jogadores;
  private List<Jogadores> casa;
  private List<Jogadores> visitante;

  public List<Jogadores> encontrarJogadores(String elenco, String temporada){
    return jERepository.findJogadoresByElencoAndTemporada(elenco, temporada);
  }

  public List<Jogadores> salvar(List<Jogadores> j){
    return repository.saveAll(j);
  }

  public List<JogadoresDTO> criarElencos(ElencosDTO e){  
    casa = encontrarJogadores(e.getCasa(), e.getTemporada());
    jogadores = jMapper.map(casa, "casa", e.getPartida());
    visitante = encontrarJogadores(e.getVisitante(), e.getTemporada());
    jogadores = jMapper.map(visitante, "visitante", e.getPartida());
    return jogadores;
  }
}

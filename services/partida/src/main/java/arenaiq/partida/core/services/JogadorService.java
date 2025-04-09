package arenaiq.partida.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.partida.core.dtos.JogadoresDTO;
import arenaiq.partida.core.mappers.JogadorMapper;
import arenaiq.partida.core.models.Jogadores;
import arenaiq.partida.core.models.Partida;
import arenaiq.partida.core.repositories.JogadorRepository;
import arenaiq.partida.core.repositories.JogadoresElencoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JogadorService {
  private final JogadorRepository repository;
  private final JogadoresElencoRepository jERepository;
  private final JogadorMapper jMapper;

  public List<Jogadores> encontrarJogadores(String elenco, String temporada){
    return jERepository.findJogadoresByElencoAndTemporada(elenco, temporada);
  }

  public List<Jogadores> salvar(List<Jogadores> j){
    return repository.saveAll(j);
  }

  public List<JogadoresDTO> criarElencos(Partida p){
    var temp = p.getTemporada();
    List<JogadoresDTO> jogadores;
    List<Jogadores> casa = encontrarJogadores(p.getCasa(), temp);
    jogadores = jMapper.map(casa, "casa", p.getId());
    List<Jogadores> visitante = encontrarJogadores(p.getVisitante(), temp);
    jogadores = jMapper.map(visitante, "visitante", p.getId());
    return jogadores;
  }
}

package arenaiq.partida.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.partida.core.dtos.JogadorDTO;
import arenaiq.partida.core.mappers.JogadorMapper;
import arenaiq.partida.core.models.Jogador;
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

  public List<JogadorDTO> encontrarJogadores(String elenco, String temporada){
    return jERepository.findJogadorByElencoAndTemporada(elenco, temporada);
  }

  public void salvar(List<Jogador> j){
    repository.saveAll(j);
  }

  public void criarElencos(Partida p){
    List<JogadorDTO> casa = encontrarJogadores(p.getCasa(), p.getTemporada());
    List<Jogador> jCasa = jMapper.map(casa, "casa", p.getId());
    salvar(jCasa);
    List<JogadorDTO> visitante = encontrarJogadores(p.getVisitante(), p.getTemporada());
    List<Jogador> jVisitante = jMapper.map(visitante, "visitante", p.getId());
    salvar(jVisitante);
  }
  
}

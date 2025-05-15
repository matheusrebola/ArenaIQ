package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.JogadoresDTO;
import arenaiq.consulta.core.models.Jogadores;

@Component
public class JogadoresMapper {

  public List<JogadoresDTO> map(List<Jogadores> j){
    return j.stream().map(jog -> map(jog)).collect(Collectors.toList());
  }

  public JogadoresDTO map(Jogadores j){
    return JogadoresDTO.builder()
                        .id(j.getId())
                        .nome(j.getNome())
                        .dataNascimento(j.getDataNascimento())
                        .nacionalidade(j.getNacionalidade())
                        .funcao(j.getFuncao())
                        .contribuicao(j.getContribuicao())
                        .estilo(j.getEstilo())
                        .personalidade(j.getPersonalidade())
                        .pe(j.getPe())
                        .altura(j.getAltura())
                        .peso(j.getPeso())
                        .posicao(j.getPosicao())
                        .funcaoPosicao(j.getFuncaoPosicao())
                        .clubes(j.getClubes())
                        .clubeAtual(j.getClubeAtual())
                        .partida(j.getPartida())
                        .build();
  }
}

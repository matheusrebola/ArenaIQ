package arenaiq.partida.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.partida.core.dtos.JogadoresDTO;
import arenaiq.partida.core.models.Jogadores;

@Component
public class JogadorMapper {

  public List<JogadoresDTO> map(List<Jogadores> jogadores, String clube) {
    return jogadores.stream()
            .map(jog -> JogadoresDTO.builder()
                    .funcao(jog.getFuncao())
                    .contribuicao(jog.getContribuicao())
                    .estilo(jog.getEstilo())
                    .personalidade(jog.getPersonalidade())
                    .pe(jog.getPe())
                    .altura(jog.getAltura())
                    .peso(jog.getPeso())
                    .posicao(jog.getPosicao())
                    .funcaoPosicao(jog.getFuncaoPosicao())
                    .clube(clube)
                    .build())
            .collect(Collectors.toList());
  }
}

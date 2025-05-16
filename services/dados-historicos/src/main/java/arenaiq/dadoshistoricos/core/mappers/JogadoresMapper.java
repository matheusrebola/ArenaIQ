package arenaiq.dadoshistoricos.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.JogadoresDTO;
import arenaiq.dadoshistoricos.core.models.Jogadores;

@Component
public class JogadoresMapper { 
  public Jogadores map(JogadoresDTO j) {
    return Jogadores.builder()
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
      .elenco(j.getElenco())
      .clube(j.getClube())
      .build();
  }
}

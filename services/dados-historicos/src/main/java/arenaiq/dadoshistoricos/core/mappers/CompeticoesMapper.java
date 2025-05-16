package arenaiq.dadoshistoricos.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.CompeticoesDTO;
import arenaiq.dadoshistoricos.core.models.Competicoes;

@Component
public class CompeticoesMapper {
   public Competicoes map(CompeticoesDTO c) {
    return Competicoes.builder()
      .nome(c.getNome())
      .competicao(c.getCompeticao())
      .disputa(c.getDisputa())
      .localidade(c.getLocalidade())
      .temporada(c.getTemporada())
      .build();
  }
}

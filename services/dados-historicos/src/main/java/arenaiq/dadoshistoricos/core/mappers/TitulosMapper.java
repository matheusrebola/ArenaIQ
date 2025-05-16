package arenaiq.dadoshistoricos.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.TitulosDTO;
import arenaiq.dadoshistoricos.core.models.Titulos;

@Component
public class TitulosMapper {
  public Titulos map(TitulosDTO t) {
    return Titulos.builder()
      .nome(t.getNome())
      .participante(t.getParticipante())
      .temporada(t.getTemporada())
      .posicao(t.getPosicao())
      .mvp(t.getMvp())
      .mvc(t.getMvc())
      .tipoTitulo(t.getTipoTitulo())
      .equipe(t.getEquipe())
      .competicao(t.getCompeticao())
      .build();
  }
}

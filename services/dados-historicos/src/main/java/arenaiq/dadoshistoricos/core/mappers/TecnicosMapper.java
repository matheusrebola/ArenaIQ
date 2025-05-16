package arenaiq.dadoshistoricos.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.TecnicosDTO;
import arenaiq.dadoshistoricos.core.models.Tecnicos;

@Component
public class TecnicosMapper {
  public Tecnicos map(TecnicosDTO t) {
    return Tecnicos.builder()
      .nome(t.getNome())
      .nacionalidade(t.getNacionalidade())
      .dataNascimento(t.getDataNascimento())
      .anosExperiencia(t.getAnosExperiencia())
      .filosofia(t.getFilosofia())
      .posicoes(t.getPosicoes())
      .build();
  }
}

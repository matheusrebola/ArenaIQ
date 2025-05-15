package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.TecnicosDTO;
import arenaiq.consulta.core.models.Tecnicos;

@Component
public class TecnicosMapper {

  public List<TecnicosDTO> map(List<Tecnicos> t){
    return t.stream().map(tec -> map(tec)).collect(Collectors.toList());
  }

  public TecnicosDTO map(Tecnicos t) {
    return TecnicosDTO.builder()
                      .id(t.getId())
                      .nome(t.getNome())
                      .nacionalidade(t.getNacionalidade())
                      .dataNascimento(t.getDataNascimento())
                      .anosExperiencia(t.getAnosExperiencia())
                      .filosofia(t.getFilosofia())
                      .jogador(t.getJogador())
                      .build();
  }
}

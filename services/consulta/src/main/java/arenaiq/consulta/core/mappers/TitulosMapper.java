package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.TitulosDTO;
import arenaiq.consulta.core.models.Titulos;

@Component
public class TitulosMapper {

  public List<TitulosDTO> map(List<Titulos> t){
    return t.stream().map(ti -> map(ti)).collect(Collectors.toList());
  }

  public TitulosDTO map(Titulos t){
    return TitulosDTO.builder()
                      .id(t.getId())
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

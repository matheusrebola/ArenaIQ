package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.PartidasDTO;
import arenaiq.consulta.core.models.Partidas;

@Component
public class PartidasMapper {

  public List<PartidasDTO> map(List<Partidas> p){
    return p.stream().map(par -> map(par)).collect(Collectors.toList());
  }

  public PartidasDTO map(Partidas p){
    return PartidasDTO.builder()
                      .id(p.getId())
                      .dataHora(p.getDataHora())
                      .clima(p.getClima())
                      .temperatura(p.getTemperatura())
                      .umidade(p.getUmidade())
                      .local(p.getLocal())
                      .casa(p.getCasa())
                      .visitante(p.getVisitante())
                      .placarC(p.getPlacarC())
                      .placarV(p.getPlacarV())
                      .competicao(p.getCompeticao())
                      .build();
  }
}

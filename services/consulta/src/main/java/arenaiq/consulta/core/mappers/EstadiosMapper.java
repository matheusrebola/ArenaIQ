package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.EstadiosDTO;
import arenaiq.consulta.core.models.Estadios;

@Component
public class EstadiosMapper {

  public List<EstadiosDTO> map(List<Estadios> e) {
    return e.stream().map(estadio -> map(estadio)).collect(Collectors.toList());
  }

  public EstadiosDTO map(Estadios e){
    return EstadiosDTO.builder()
                      .id(e.getId())
                      .nome(e.getNome())
                      .cidade(e.getCidade())
                      .pais(e.getPais())
                      .clubeMandante(e.getClubeMandante())
                      .capacidade(e.getCapacidade())
                      .grama(e.getGrama())
                      .comprimento(e.getComprimento())
                      .largura(e.getLargura())
                      .cobertura(e.getCobertura())
                      .drenagem(e.getDrenagem())
                      .inclinacao(e.getInclinacao())
                      .vento(e.getVento())
                      .clima(e.getClima())
                      .ultimoReparo(e.getUltimoReparo())
                      .observacoes(e.getObservacoes())
                      .build();
  }
}

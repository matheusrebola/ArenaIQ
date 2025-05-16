package arenaiq.dadoshistoricos.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.dadoshistoricos.core.dtos.EstadiosDTO;
import arenaiq.dadoshistoricos.core.models.Estadios;

@Component
public class EstadiosMapper {
  public Estadios map(EstadiosDTO e){
    return Estadios.builder()
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

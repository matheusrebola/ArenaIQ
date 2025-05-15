package arenaiq.consulta.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import arenaiq.consulta.core.dtos.CompeticoesDTO;
import arenaiq.consulta.core.models.Competicoes;

@Component
public class CompeticoesMapper {

  public List<CompeticoesDTO> map(List<Competicoes> c){
    return c.stream().map(comp -> map(comp)).collect(Collectors.toList());            
  }

  public CompeticoesDTO map(Competicoes c){
    return CompeticoesDTO.builder()
                          .id(c.getId())
                          .nome(c.getNome())
                          .competicao(c.getCompeticao())
                          .disputa(c.getDisputa())
                          .localidade(c.getLocalidade())
                          .temporada(c.getTemporada())
                          .build();
  }
}

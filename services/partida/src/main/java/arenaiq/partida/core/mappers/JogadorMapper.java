package arenaiq.partida.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.partida.core.dtos.JogadorDTO;
import arenaiq.partida.core.models.Jogador;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JogadorMapper {
  private final ModelMapper mapper;

  public List<Jogador> map(List<JogadorDTO> dtos, String lado, String id) {
    return dtos.stream()
               .map(dto -> {
                 Jogador jogador = mapper.map(dto, Jogador.class);
                 jogador.setPartidaId(id);
                 jogador.setLado(lado);
                 return jogador;
               })
               .collect(Collectors.toList());
  }
}

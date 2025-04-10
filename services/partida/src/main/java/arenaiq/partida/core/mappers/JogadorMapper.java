package arenaiq.partida.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.partida.core.models.Jogadores;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JogadorMapper {
  private final ModelMapper mapper;

  public List<Jogadores> map(List<Jogadores> j, String id) {
    return j.stream()
               .map(dto -> {
                 Jogadores jogador = mapper.map(dto, Jogadores.class);
                 jogador.setPartida(id);
                 return jogador;
               })
               .collect(Collectors.toList());
  }

}

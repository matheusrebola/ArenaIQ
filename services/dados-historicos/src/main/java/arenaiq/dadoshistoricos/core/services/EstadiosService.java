package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Estadios;
import arenaiq.dadoshistoricos.core.repositories.EstadiosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstadiosService {
  private final EstadiosRepository r;

  public Estadios salvar(Estadios e){
    return r.save(e);
  }
}

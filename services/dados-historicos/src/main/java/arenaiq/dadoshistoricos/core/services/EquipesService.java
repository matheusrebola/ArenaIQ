package arenaiq.dadoshistoricos.core.services;

import org.springframework.stereotype.Service;

import arenaiq.dadoshistoricos.core.models.Equipes;
import arenaiq.dadoshistoricos.core.repositories.EquipesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EquipesService {
  private final EquipesRepository repository;

  public Equipes salvar(Equipes e) {
    return repository.save(e);
  }

}

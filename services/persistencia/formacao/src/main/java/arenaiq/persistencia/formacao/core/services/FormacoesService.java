package arenaiq.persistencia.formacao.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.persistencia.formacao.core.models.Formacoes;
import arenaiq.persistencia.formacao.core.repositories.FormacoesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FormacoesService {
  private final FormacoesRepository r;

  public List<Formacoes> encontrarTodos() {
    return r.findAll();
  }

}

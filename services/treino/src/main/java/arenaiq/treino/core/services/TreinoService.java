package arenaiq.treino.core.services;

import org.springframework.stereotype.Service;

import arenaiq.treino.core.models.Eventos;
import arenaiq.treino.core.models.Formacoes;
import arenaiq.treino.core.models.LinhaDefensiva;
import arenaiq.treino.core.repositories.EventosRepository;
import arenaiq.treino.core.repositories.FormacoesRepository;
import arenaiq.treino.core.repositories.LinhaDefensivaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TreinoService {
  private final EventosRepository eventoR;
  private final FormacoesRepository formacoesR;
  private final LinhaDefensivaRepository linhaR;

  public Eventos salvar(Eventos e){
    return eventoR.save(e);
  }

  public Formacoes salvar(Formacoes f){
    return formacoesR.save(f);
  }

  public LinhaDefensiva salvar(LinhaDefensiva l){
    return linhaR.save(l);
  }

}

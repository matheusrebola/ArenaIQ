package arenaiq.treino.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import arenaiq.treino.core.models.Eventos;
import arenaiq.treino.core.models.Formacoes;
import arenaiq.treino.core.models.Linhas;
import arenaiq.treino.core.models.Movimentacoes;
import arenaiq.treino.core.repositories.EventosRepository;
import arenaiq.treino.core.repositories.FormacoesRepository;
import arenaiq.treino.core.repositories.LinhaRepository;
import arenaiq.treino.core.repositories.MovimentacoesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TreinoService {
  private final EventosRepository eventoR;
  private final FormacoesRepository formacoesR;
  private final LinhaRepository linhaR;
  private final MovimentacoesRepository moviR;

  public Eventos salvar(Eventos e){
    return eventoR.save(e);
  }

  public Formacoes salvar(Formacoes f){
    return formacoesR.save(f);
  }

  public Linhas salvar(Linhas l){
    return linhaR.save(l);
  }
  
  public Movimentacoes salvar(Movimentacoes m) {
    return moviR.save(m);
  }

  public List<Eventos> encontrarEventos(){
    return eventoR.findAll();
  }

  public List<Formacoes> encontrarFormacoes(){
    return formacoesR.findAll();
  }

  public List<Linhas> encontrarLinhas(){
    return linhaR.findAll();
  }

  public List<Movimentacoes> encontrarMovimentacoes() {
    return moviR.findAll();
  }
}

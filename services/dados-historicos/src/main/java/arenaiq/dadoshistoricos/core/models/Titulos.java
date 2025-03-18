package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.dadoshistoricos.core.models.enums.ECompeticao;
import arenaiq.dadoshistoricos.core.models.enums.EParticipante;
import lombok.Data;

@Table
@Data
public class Titulos {
  @Id
  private String id;
  private String nome;
  private EParticipante participante;
  private String temporadaId;
  private String posicao;
  private String mvp;
  private ECompeticao tipoTitulo;
  private String participanteId;
  private String competicaoId;
}

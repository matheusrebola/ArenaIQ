package arenaiq.consulta.core.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EParticipante;
import lombok.Data;

@Table
@Data
public class Titulos {
  @PrimaryKey
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

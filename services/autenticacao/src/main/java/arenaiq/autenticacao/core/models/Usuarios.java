package arenaiq.autenticacao.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "usuarios")
@Data
public class Usuarios {
  @Id
  private String id;
  private String nome;
  private String email;
  private String senha;
  private EAcesso acesso;
}

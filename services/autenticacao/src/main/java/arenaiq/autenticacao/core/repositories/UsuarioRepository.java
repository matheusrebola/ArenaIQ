package arenaiq.autenticacao.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import arenaiq.autenticacao.core.models.Usuarios;

public interface UsuarioRepository extends MongoRepository<Usuarios, String> {
  Usuarios findByEmail(String email);

}

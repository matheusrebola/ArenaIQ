package arenaiq.cadastro.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import arenaiq.cadastro.core.models.Usuarios;

public interface UsuarioRepository extends MongoRepository<Usuarios, String> {

  boolean existsByEmail(String e);

}

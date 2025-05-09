package arenaiq.cadastro.core.services;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import arenaiq.cadastro.core.models.Usuarios;
import arenaiq.cadastro.core.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CadastroService {
  private final UsuarioRepository repository;
  private final PasswordEncoder passwordEncoder;

  public String hashSenha(String senhaPura) {
    return passwordEncoder.encode(senhaPura);
  }
  
  public Usuarios salvar(Usuarios u) {
    return repository.save(u);
  }

  public boolean existenciaEmail(String e){
    return repository.existsByEmail(e);
  }

  public List<Usuarios> encontrarTodos() {
    return repository.findAll();
  }

}

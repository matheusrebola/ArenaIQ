package arenaiq.autenticacao.core.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import arenaiq.autenticacao.core.dtos.AutenticacaoDTO;
import arenaiq.autenticacao.core.dtos.UsuarioDTO;
import arenaiq.autenticacao.core.mappers.UsuarioMapper;
import arenaiq.autenticacao.core.models.Usuarios;
import arenaiq.autenticacao.core.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AutenticacaoService {
  private final UsuarioRepository repository;
  private final PasswordEncoder passwordEncoder;
  private final UsuarioMapper mapper;

  private Usuarios encontrarUsuarioPeloEmail(String u){
    return repository.findByEmail(u);
  }

  public UsuarioDTO validarUsuario(AutenticacaoDTO dto) {
    Usuarios u = encontrarUsuarioPeloEmail(dto.getEmail());
    if (autenticar(dto.getSenha(), u.getSenha()) == false) {
      return null;
    }
    return mapper.map(u);
  }

  private boolean autenticar(String senhaInformada, String senhaArmazenada) {
    return passwordEncoder.matches(senhaInformada, senhaArmazenada);
  }
}

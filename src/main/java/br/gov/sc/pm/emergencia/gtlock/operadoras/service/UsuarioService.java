package br.gov.sc.pm.emergencia.gtlock.operadoras.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Usuario;
import br.gov.sc.pm.emergencia.gtlock.operadoras.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public void salvar(Usuario usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        usuarioRepository.save(usuario);
    }

    public Usuario obterPorLogin(String login) {
        return usuarioRepository.findByLogin(login);
    }

}

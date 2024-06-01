package com.ide.hackaton.usuario.domain;

import com.ide.hackaton.usuario.infrastucture.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario registerUsuario(Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public boolean authenticateUser(String email, String password) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByEmail(email);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            return passwordEncoder.matches(password, usuario.getPassword());
        }
        return false;
    }
}
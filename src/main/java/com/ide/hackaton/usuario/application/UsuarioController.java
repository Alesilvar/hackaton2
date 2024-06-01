package com.ide.hackaton.usuario.application;

import com.ide.hackaton.usuario.domain.Usuario;
import com.ide.hackaton.usuario.domain.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/register")
    public ResponseEntity<Usuario> register(@RequestBody Usuario usuario) {
        Usuario registeredUsuario = usuarioService.registerUsuario(usuario);
        return ResponseEntity.ok(registeredUsuario);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        boolean isAuthenticated = usuarioService.authenticateUser(email, password);
        if (isAuthenticated) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }
}

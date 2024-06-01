package com.ide.hackaton.usuario.infrestructure;

import com.ide.hackaton.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Aquí puedes agregar métodos personalizados de consulta si los necesitas
}
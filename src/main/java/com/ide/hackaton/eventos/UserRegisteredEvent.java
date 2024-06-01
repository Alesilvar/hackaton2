package com.ide.hackaton.eventos;

import com.ide.hackaton.usuario.domain.Usuario;
import org.springframework.context.ApplicationEvent;

public class UserRegisteredEvent extends ApplicationEvent {

    private Usuario usuario;

    public UserRegisteredEvent(Object source, Usuario usuario) {
        super(source);
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
package com.ide.hackaton.eventos;

import com.ide.hackaton.mail.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegisteredEventListener {

    @Autowired
    private EmailService emailService;

    @EventListener
    public void handleUserRegisteredEvent(UserRegisteredEvent event) {
        emailService.sendWelcomeEmail(event.getUsuario());
    }
}

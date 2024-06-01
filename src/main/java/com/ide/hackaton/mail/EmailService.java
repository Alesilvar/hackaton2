package com.ide.hackaton.mail;

import com.ide.hackaton.usuario.domain.Usuario;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendWelcomeEmail(Usuario usuario) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(usuario.getEmail());
        message.setSubject("Welcome to our application");
        message.setText("Thank you for registering, " + usuario.getNombre() + "!");
        mailSender.send(message);
    }
}

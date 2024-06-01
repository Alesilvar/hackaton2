package com.ide.hackaton.usuario.domain;

import com.ide.hackaton.listareproduccion.domain.ListaReproduccion;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.hibernate.annotations.CascadeType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Usuario {

    private String nombre;
    private String email;
    private String password;
    private Date fechaDeRegistro;
    @Id
    private int idUser;

    // Constructor
    public Usuario(int idUser, String nombre, String email, String password, Date fechaDeRegistro) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Usuario() {

    }

    // Getters y Setters
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    // Método toString
    @Override
    public String toString() {
        return "Usuario{" +
                "idUser=" + idUser +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fechaDeRegistro=" + fechaDeRegistro +
                '}';
    }


}

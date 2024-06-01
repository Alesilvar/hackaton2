package com.ide.hackaton.listareproduccion.domain;

import com.ide.hackaton.usuario.domain.Usuario;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class ListaReproduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_playlist")
    private int idPlaylist;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "id_user")
    private int idUser;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario usuario;

    // Constructor por defecto
    public ListaReproduccion() {
    }

    // Constructor con parámetros
    public ListaReproduccion(String nombre, int idUser, Date fechaCreacion) {
        this.nombre = nombre;
        this.idUser = idUser;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y Setters
    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "ListaReproduccion{" +
                "idPlaylist=" + idPlaylist +
                ", nombre='" + nombre + '\'' +
                ", idUser=" + idUser +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}

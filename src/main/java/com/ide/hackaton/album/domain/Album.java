package com.ide.hackaton.album.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity

public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_album")
    private int idAlbum;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_lanzamiento")
    @Temporal(TemporalType.DATE)
    private Date fechaLanzamiento;

    // Constructor por defecto
    public Album() {
    }

    // Constructor con parámetros
    public Album(String nombre, Date fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    // Getters y Setters
    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    // Método toString
    @Override
    public String toString() {
        return "Album{" +
                "idAlbum=" + idAlbum +
                ", nombre='" + nombre + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }}
package com.ide.hackaton.Artista.domain;

import jakarta.persistence.*;

@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_artista")
    private int idArtista;

    @Column(name = "nombre")
    private String nombre;

    // Constructor por defecto
    public Artista() {
    }

    // Constructor con parámetros
    public Artista(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString
    @Override
    public String toString() {
        return "Artista{" +
                "idArtista=" + idArtista +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

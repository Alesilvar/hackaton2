package com.ide.hackaton.cancion.domain;


import com.ide.hackaton.Artista.domain.Artista;
import com.ide.hackaton.album.domain.Album;
import com.ide.hackaton.listareproduccion.domain.ListaReproduccion;
import com.ide.hackaton.usuario.domain.Usuario;
import jakarta.persistence.*;

@Entity
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_song")
    private int idSong;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "id_artista")
    private int idArtista;

    @Column(name = "id_album")
    private int idAlbum;

    @Column(name = "duracion")
    private int duracion;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_album")
    private Album album;
    @ManyToOne
    @JoinColumn(name = "id_artista")
    private Artista artista;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lista_reproduccion")
    private ListaReproduccion listaReproduccion;
    // Constructor por defecto
    public Cancion() {
    }

    // Constructor con parámetros
    public Cancion(String titulo, int idArtista, int idAlbum, int duracion) {
        this.titulo = titulo;
        this.idArtista = idArtista;
        this.idAlbum = idAlbum;
        this.duracion = duracion;
    }

    // Getters y Setters
    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cancion{" +
                "idSong=" + idSong +
                ", titulo='" + titulo + '\'' +
                ", idArtista=" + idArtista +
                ", idAlbum=" + idAlbum +
                ", duracion=" + duracion +
                '}';
    }
}

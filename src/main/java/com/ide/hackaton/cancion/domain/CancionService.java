package com.ide.hackaton.cancion.domain;

import com.ide.hackaton.cancion.domain.Cancion;
import com.ide.hackaton.cancion.exceptions.ResourceNotFoundException;
import com.ide.hackaton.cancion.infrastructure.CancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CancionService {

    @Autowired
    private CancionRepository cancionRepository;

    public List<Cancion> getAllCanciones() {
        return cancionRepository.findAll();
    }

    public Cancion createCancion(Cancion cancion) {
        return cancionRepository.save(cancion);
    }

    public Optional<Cancion> getCancionById(long id) {
        return cancionRepository.findById(id);
    }

    public Cancion updateCancion(long idSong, Cancion cancionDetails) {
        Cancion cancion = cancionRepository.findById(idSong).orElseThrow(() -> new ResourceNotFoundException("Cancion", "id", idSong));
        cancion.setTitulo(cancionDetails.getTitulo());
        cancion.setDuracion(cancionDetails.getDuracion());
        // Set other fields
        return cancionRepository.save(cancion);
    }

    public void deleteCancion(long idSong) {
        Cancion cancion = cancionRepository.findById(idSong).orElseThrow(() -> new ResourceNotFoundException("Cancion", "id", idSong));
        cancionRepository.delete(cancion);
    }
}
package com.ide.hackaton.cancion.domain;

import com.ide.hackaton.cancion.infrestructure.CancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CancionService {
    private final CancionRepository cancionRepository;

    @Autowired
    public CancionService(CancionRepository cancionRepository) {
        this.cancionRepository = cancionRepository;
    }

    public Cancion getCancionById(int id) {
        Optional<Cancion> optionalCancion = cancionRepository.findById(id);
        return optionalCancion.orElse(null);
    }

    public Cancion createCancion(Cancion cancion) {
        return cancionRepository.save(cancion);
    }

    public Cancion updateCancion(int id, Cancion cancionDetails) {
        Optional<Cancion> optionalCancion = cancionRepository.findById(id);
        if (optionalCancion.isPresent()) {
            Cancion existingCancion = optionalCancion.get();
            existingCancion.setTitulo(cancionDetails.getTitulo());
            // Actualizar otros campos según sea necesario
            return cancionRepository.save(existingCancion);
        } else {
            return null; // o lanzar una excepción indicando que la canción no se encontró
        }
    }

    public boolean deleteCancion(int id) {
        Optional<Cancion> optionalCancion = cancionRepository.findById(id);
        if (optionalCancion.isPresent()) {
            cancionRepository.deleteById(id);
            return true;
        } else {
            return false; // o lanzar una excepción indicando que la canción no se encontró
        }
    }
}

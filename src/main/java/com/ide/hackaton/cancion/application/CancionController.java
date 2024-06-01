package com.ide.hackaton.cancion.application;

import com.ide.hackaton.cancion.domain.Cancion;
import com.ide.hackaton.cancion.domain.CancionService;
import com.ide.hackaton.cancion.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canciones")
public class CancionController {

    @Autowired
    private CancionService cancionService;

    @GetMapping
    public List<Cancion> getAllCanciones() {
        return cancionService.getAllCanciones();
    }

    @PostMapping
    public Cancion createCancion(@RequestBody Cancion cancion) {
        return cancionService.createCancion(cancion);
    }

    @GetMapping("/{id}")
    public Cancion getCancionById(@PathVariable(value = "id") int cancionId) {
        return cancionService.getCancionById(cancionId)
                .orElseThrow(() -> new ResourceNotFoundException("Cancion", "id", cancionId));
    }

    @PutMapping("/{id}")
    public Cancion updateCancion(@PathVariable(value = "id") int cancionId, @RequestBody Cancion cancionDetails) {
        return cancionService.updateCancion(cancionId, cancionDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCancion(@PathVariable(value = "id") int cancionId) {
        cancionService.deleteCancion(cancionId);
        return ResponseEntity.ok().build();
    }
}
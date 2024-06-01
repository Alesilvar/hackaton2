package com.ide.hackaton.cancion.aplication;

import com.ide.hackaton.cancion.domain.Cancion;
import com.ide.hackaton.cancion.domain.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/canciones")

@RestController
public class CancionController {
    private final CancionService cancionService;

    @Autowired
    public CancionController(CancionService cancionService) {
        this.cancionService = cancionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cancion> getCancionById(@PathVariable int id) {
        Cancion cancion = cancionService.getCancionById(id);
        if (cancion != null) {
            return new ResponseEntity<>(cancion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Cancion> createCancion(@RequestBody Cancion cancion) {
        Cancion createdCancion = cancionService.createCancion(cancion);
        return new ResponseEntity<>(createdCancion, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cancion> updateCancion(@PathVariable int id, @RequestBody Cancion cancionDetails) {
        Cancion updatedCancion = cancionService.updateCancion(id, cancionDetails);
        if (updatedCancion != null) {
            return new ResponseEntity<>(updatedCancion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCancion(@PathVariable int id) {
        boolean deleted = cancionService.deleteCancion(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}

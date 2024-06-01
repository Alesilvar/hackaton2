package com.ide.hackaton.cancion.infrestructure;

import com.ide.hackaton.cancion.domain.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, Integer> {
    // Aquí puedes agregar métodos personalizados de consulta si los necesitas
}

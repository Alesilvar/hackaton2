package com.ide.hackaton.cancion.infrastructure;

import com.ide.hackaton.cancion.domain.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancionRepository extends JpaRepository<Cancion, Long> {
}
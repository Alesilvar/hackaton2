package com.ide.hackaton.listareproduccion.infrastructure;

import com.ide.hackaton.listareproduccion.domain.ListaReproduccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaDeReproduccionRepository extends JpaRepository<ListaReproduccion, Long> {
}

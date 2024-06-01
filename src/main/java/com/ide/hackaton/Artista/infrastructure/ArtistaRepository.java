package com.ide.hackaton.Artista.infrastructure;

import com.ide.hackaton.Artista.domain.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}

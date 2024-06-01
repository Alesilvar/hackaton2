package com.ide.hackaton.album.infrastructure;

import com.ide.hackaton.album.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
package com.fernandopaniagua.ifct0062_2025_fake_omdb.repository;

import com.fernandopaniagua.ifct0062_2025_fake_omdb.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IMovieRepository extends JpaRepository<Movie, String> {
    public Optional<Movie> findFirstByTitleContaining(String title);
    public List<Movie> findByTitleContaining(String title);
}

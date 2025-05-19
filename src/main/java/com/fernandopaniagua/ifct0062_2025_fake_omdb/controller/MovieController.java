package com.fernandopaniagua.ifct0062_2025_fake_omdb.controller;

import com.fernandopaniagua.ifct0062_2025_fake_omdb.model.Movie;
import com.fernandopaniagua.ifct0062_2025_fake_omdb.service.interfaces.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/movies/")
public class MovieController {
    private MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie newMovie = movieService.create(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMovie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable String id) {
        Movie movie = movieService.findById(id);
        return ResponseEntity.ok().body(Map.of(
                "data", movie,
                "message", "Movie found"
        ));
    }
}

package com.fernandopaniagua.ifct0062_2025_fake_omdb.service;

import com.fernandopaniagua.ifct0062_2025_fake_omdb.model.Movie;
import com.fernandopaniagua.ifct0062_2025_fake_omdb.repository.IMovieRepository;
import com.fernandopaniagua.ifct0062_2025_fake_omdb.service.interfaces.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieServiceTest {
    @Autowired
    MovieService movieService;

    @Autowired
    IMovieRepository iMovieRepository;

    @Test
    public void create() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        movieService.delete(movie);
    }

    @Test
    public void readById() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        movie = movieService.findById(movie.getImdbId());
        Assertions.assertNotNull(movie);
        movieService.delete(movie);
    }

    @Test
    public void findOneByTitle() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        Movie readedMovie = movieService.findByTitle("final");
        Assertions.assertNotNull(readedMovie);
        movieService.delete(movie);
    }


}

package com.fernandopaniagua.ifct0062_2025_fake_omdb.service.impl;

import com.fernandopaniagua.ifct0062_2025_fake_omdb.model.Movie;
import com.fernandopaniagua.ifct0062_2025_fake_omdb.repository.IMovieRepository;
import com.fernandopaniagua.ifct0062_2025_fake_omdb.service.interfaces.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private IMovieRepository iMovieRepository;

    public MovieServiceImpl(IMovieRepository iMovieRepository) {
        this.iMovieRepository = iMovieRepository;
    }

    @Override
    public Movie create(Movie movie) {
        return iMovieRepository.save(movie);
    }

    @Override
    public void delete(Movie movie) {
        iMovieRepository.delete(movie);
    }

    @Override
    public Movie findById(String imdbId) {
        return iMovieRepository.findById(imdbId).orElse(null);
    }

    @Override
    public Movie findByTitle(String title) {
        return iMovieRepository.findFirstByTitleContaining(title).orElse(null);
    }

    @Override
    public List<Movie> findMoviesByTitle(String title) {
        return iMovieRepository.findByTitleContaining(title);
    }
}

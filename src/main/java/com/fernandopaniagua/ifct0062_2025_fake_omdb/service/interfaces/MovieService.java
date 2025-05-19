package com.fernandopaniagua.ifct0062_2025_fake_omdb.service.interfaces;

import com.fernandopaniagua.ifct0062_2025_fake_omdb.model.Movie;

import java.util.List;

public interface MovieService {
    public Movie create(Movie movie);
    public void delete(Movie movie);
    public Movie findById(String imdbId);
    public Movie findByTitle(String title);
    public List<Movie> findMoviesByTitle(String title);
}

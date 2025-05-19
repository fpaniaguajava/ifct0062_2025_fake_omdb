package com.fernandopaniagua.ifct0062_2025_fake_omdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    private String imdbId;
    private String title;
    private String director;
    private int year;

    public Movie() {
    }

    public Movie(String imdbId, String title, String director, int year) {
        this.imdbId = imdbId;
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

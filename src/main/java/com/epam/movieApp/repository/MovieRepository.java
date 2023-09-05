package com.epam.movieApp.repository;

import com.epam.movieApp.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {
    List<Movie> findByTitleContainingIgnoreCase(String title);
    List<Movie> findByReleaseDate(LocalDate releaseDate);
}

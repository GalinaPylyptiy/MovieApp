package com.epam.movieApp.service;

import com.epam.movieApp.model.Movie;
import com.epam.movieApp.repository.ActorRepository;
import com.epam.movieApp.repository.DirectorRepository;
import com.epam.movieApp.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final ActorRepository actorRepository;
    private final DirectorRepository directorRepository;

    public MovieService(MovieRepository movieRepository, ActorRepository actorRepository, DirectorRepository directorRepository) {
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
        this.directorRepository = directorRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(String id) {
        return movieRepository.findById(id).
                orElseThrow(() -> new RuntimeException("The movie with id " + id + " is not found"));
    }

    public Movie createMovie(Movie movie) {
        movie.getActors()
                .forEach(actorRepository::save);
        movie.getDirectors()
                .forEach(directorRepository::save);
        return movieRepository.save(movie);
    }

    public Movie updateMovie(String id, Movie updatedMovie) {
        Movie existingMovie = getMovieById(id);
        existingMovie.setTitle(updatedMovie.getTitle());
        existingMovie.setReleaseDate(updatedMovie.getReleaseDate());
        existingMovie.setRuntime(updatedMovie.getRuntime());
        existingMovie.setActors(updatedMovie.getActors());
        existingMovie.setDirectors(updatedMovie.getDirectors());
        return movieRepository.save(existingMovie);
    }

    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }

    public List<Movie> findByTitle(String title){
        return movieRepository.findByTitleContainingIgnoreCase(title);

    }

    public List<Movie> findByReleaseDate(LocalDate releaseDate){
        return movieRepository.findByReleaseDate(releaseDate);
    }


}


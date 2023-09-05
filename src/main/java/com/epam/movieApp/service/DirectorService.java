package com.epam.movieApp.service;

import com.epam.movieApp.model.Director;
import com.epam.movieApp.repository.DirectorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DirectorService {

    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    public Director getDirectorById(String id) {
        return directorRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("The director with id " + id + " is not found") );
    }

    public Director createDirector(Director director) {
        return directorRepository.save(director);
    }

    public Director updateDirector(String id, Director updatedDirector) {
        Director existingDirector = getDirectorById(id);
        existingDirector.setName(updatedDirector.getName());
        return directorRepository.save(existingDirector);
    }

    public void deleteDirector(String id) {
        directorRepository.deleteById(id);
    }
}


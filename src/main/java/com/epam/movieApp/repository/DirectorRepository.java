package com.epam.movieApp.repository;

import com.epam.movieApp.model.Director;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DirectorRepository extends MongoRepository<Director, String> {

}

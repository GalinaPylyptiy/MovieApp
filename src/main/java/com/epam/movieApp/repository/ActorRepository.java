package com.epam.movieApp.repository;

import com.epam.movieApp.model.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActorRepository extends MongoRepository<Actor, String> {

}

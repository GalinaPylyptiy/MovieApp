package com.epam.movieApp.service;

import com.epam.movieApp.model.Actor;
import com.epam.movieApp.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    public Actor getActorById(String id) {
        return actorRepository.findById(id).
                orElseThrow(() -> new RuntimeException("The actor with id " + id + " is not found"));
    }

    public Actor createActor(Actor actor) {
        return actorRepository.save(actor);
    }

    public Actor updateActor(String id, Actor updatedActor) {
        Actor existingActor = getActorById(id);
        existingActor.setName(updatedActor.getName());
        return actorRepository.save(existingActor);
    }

    public void deleteActor(String id) {
        actorRepository.deleteById(id);
    }
}


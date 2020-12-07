package com.eventmanagment.boot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eventmanagment.boot.entities.Organizer;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {

}

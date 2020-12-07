package com.eventmanagment.boot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eventmanagment.boot.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}

package com.eventmanagment.boot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eventmanagment.boot.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}

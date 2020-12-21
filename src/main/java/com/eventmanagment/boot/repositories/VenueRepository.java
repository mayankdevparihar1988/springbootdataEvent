package com.eventmanagment.boot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eventmanagment.boot.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}

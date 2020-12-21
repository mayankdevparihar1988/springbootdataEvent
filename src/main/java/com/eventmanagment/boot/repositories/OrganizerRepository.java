package com.eventmanagment.boot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eventmanagment.boot.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}

package com.eventmanagment.boot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eventmanagment.boot.entities.Participant;

public interface ParticipentRepository extends PagingAndSortingRepository<Participant, Long> {

}

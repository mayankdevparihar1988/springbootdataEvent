package com.eventmanagment.boot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eventmanagment.boot.entities.Participant;

public interface ParticipentRepository extends CrudRepository<Participant, Long> {

}

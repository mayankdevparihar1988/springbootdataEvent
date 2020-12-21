package com.eventmanagment.boot.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventmanagment.boot.entities.Event;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {
	
	@Autowired
	private EventRepository eventRepository;

	
	
	@PostMapping("/start/{id}")
	public ResponseEntity<String> start(@PathVariable Long id){
		
		
		Optional<Event> result = eventRepository.findById(id);
		
		if(result.isEmpty()) {
			throw new ResourceNotFoundException();
		}
		
		Event event = result.get();
		
		event.setStarted(true);
		
		eventRepository.save(event);
		
		return ResponseEntity.ok(event.getName()+" has Started!");
	}
	
	

}

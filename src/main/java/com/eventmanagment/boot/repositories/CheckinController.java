package com.eventmanagment.boot.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventmanagment.boot.entities.Participant;
import com.eventmanagment.boot.repositories.exceptions.AlredayCheckedInExeception;

@RepositoryRestController
@RequestMapping("/events")
public class CheckinController {

	@Autowired
	ParticipentRepository participantRepository;

	public CheckinController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/checkin/{id}")
	public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler) {

		Optional<Participant> result = participantRepository.findById(id);

		if (result.isEmpty()) {

			throw new ResourceNotFoundException();

		}

		Participant participant = result.get();
		if (participant != null) {

			if (participant.getChecked()== true) {

				throw new AlredayCheckedInExeception();

			}

			participant.setChecked(true);
			participantRepository.save(participant);

		}

		return ResponseEntity.ok(assembler.toFullResource(participant));
	}

}

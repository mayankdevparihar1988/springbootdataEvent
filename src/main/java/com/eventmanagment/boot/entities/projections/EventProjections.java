package com.eventmanagment.boot.entities.projections;

import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.eventmanagment.boot.entities.Event;

@Projection(name = "partialEvent",types = {Event.class})
public interface EventProjections {
	
	String getName();
	String getDescription();
	ZonedDateTime getStartTime();
	ZonedDateTime getEndTime();

}

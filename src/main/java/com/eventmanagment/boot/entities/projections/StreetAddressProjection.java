package com.eventmanagment.boot.entities.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.eventmanagment.boot.entities.Venue;

@Projection(name="fullAddress",types = { Venue.class })
public interface StreetAddressProjection {
	
	@Value("#{target.streetAddress} #{target.streetAddress2}")
	String getFullAddress();

}

package com.eventmanagment.boot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Participant extends AbstractEntity {
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	private Boolean checked;
	
	// One event can be attended by many participants 
	// without event cannot be a participant thats why nullable false
	// one a participant is create with an event we can not update the participant
	// FetchType is Eager cause we want the Participant with Event
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName ="ID", nullable = false,updatable = false )
	private Event event;
	

	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Boolean getChecked() {
		
		// Handling null error
		if(this.checked == null) {
			return false;
		}
		
		return checked;
	}


	public void setChecked(Boolean checked) {
		this.checked = checked;
	}


	public Participant() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((checked == null) ? 0 : checked.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participant other = (Participant) obj;
		if (checked == null) {
			if (other.checked != null)
				return false;
		} else if (!checked.equals(other.checked))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}

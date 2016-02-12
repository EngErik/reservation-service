package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue
	private Long id;

	private String reservationName;
	
	public Reservation(String reservationName) {
		this.reservationName = reservationName;
	}
	
	Reservation() {
	}
	
	@Override
	public String toString() {
		return "Reservation{" + id +
				", reservationName='" + reservationName + '\'' +
				'}';
		
	}

	public String getReservationName() {
		return reservationName;
	}

	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

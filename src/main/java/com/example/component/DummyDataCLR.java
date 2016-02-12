package com.example.component;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Reservation;
import com.example.respository.ReservationRepository;

/* A dummy data injection running when spring boot starts*/

@Component
public class DummyDataCLR implements CommandLineRunner{

	@Override
	public void run(String... names) throws Exception {
		Stream.of("Person 1", "Person 2", "Person 3", "Person4")
				.forEach( name -> reservationRepository.save(new Reservation(name)) );
		
		reservationRepository.findAll().forEach(System.out::println);
		reservationRepository.findByReservationName("Person 2").forEach(System.out::println);
	}
	
	@Autowired
	private ReservationRepository reservationRepository;

}

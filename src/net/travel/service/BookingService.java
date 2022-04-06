package net.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.travel.entity.AgencyDetails;
import net.travel.entity.Booking;
import net.travel.entity.TravelPack;
import net.travel.repository.BookingRepository;
import net.travel.repository.UserRepository;

@Service
public class BookingService implements BookingServiceI {
	@Autowired BookingRepository brepo;

	@Override
	public void save(Booking bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Booking> listAll() {
		// TODO Auto-generated method stub
		return (List<Booking>) brepo.findAll();
	}

	@Override
	public Booking get(Long bid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long bid) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	}
	



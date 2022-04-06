package net.travel.service;

import java.util.List;

import net.travel.entity.Booking;




public interface BookingServiceI  {

	public void save(Booking bid);

	public List<Booking> listAll();

	public Booking get(Long bid);

	public void delete(Long bid); 
	

	  
}

package net.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.travel.entity.AgencyDetails;

import net.travel.repository.AgencyRepository;

@Service
public class AgencyService implements AgencyServiceI {
	@Autowired AgencyRepository arepo;

	@Override
	public void save(AgencyDetails acrea) {
		arepo.save(acrea);
		
	}

	@Override
	public List<AgencyDetails> listAll() {
		// TODO Auto-generated method stub
		return (List<AgencyDetails>) arepo.findAll();
	}

	@Override
	public AgencyDetails get(Long agency_id) {
		// TODO Auto-generated method stub
		return (AgencyDetails) arepo.findById(agency_id).get();
	}

	@Override
	public void delete(Long agency_id) {
		// TODO Auto-generated method stub
		arepo.deleteById(agency_id);
		
	}

	@Override
	public AgencyDetails loginagency(String aname, String password) {
		// TODO Auto-generated method stub
		return arepo.loginagency(aname, password);
	}
	
	
}

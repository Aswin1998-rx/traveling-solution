package net.travel.service;

import java.util.List;

import net.travel.entity.AgencyDetails;


public interface AgencyServiceI {
	public void save(AgencyDetails agency_id);

	public List<AgencyDetails> listAll();

	public AgencyDetails get(Long agency_id);

	public void delete(Long agency_id); 
	

	  public AgencyDetails loginagency(String aname,String password);

}

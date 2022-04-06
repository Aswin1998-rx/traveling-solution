package net.travel.service;

import java.util.List;

import net.travel.entity.TravelPack;


public interface PackageServiceI  {
	public void save(TravelPack packs);
	public List<TravelPack> listAll();
	public TravelPack get( Long packid);
	public void delete( Long packid);

}

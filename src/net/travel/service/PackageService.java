package net.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.travel.entity.AgencyDetails;
import net.travel.entity.TravelPack;
import net.travel.entity.Userinfo;
import net.travel.repository.TravelRepository;
import net.travel.repository.UserRepository;

@Service
@Transactional
public class PackageService implements PackageServiceI {
@Autowired TravelRepository trepo;

@Override
public void save(TravelPack packs) {
	trepo.save(packs);
	
}

@Override
public List<TravelPack> listAll() {
	// TODO Auto-generated method stub
	return (List<TravelPack>) trepo.findAll();
}

@Override
public TravelPack get(Long packid) {
	return trepo.findById(packid).get();
}

@Override
public void delete(Long packid) {
	trepo.deleteById(packid);
	
}



}

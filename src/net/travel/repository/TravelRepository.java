package net.travel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.travel.entity.TravelPack;


@Repository("travelrepository")
public interface TravelRepository extends CrudRepository<TravelPack, Long> {

}

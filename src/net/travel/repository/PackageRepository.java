package net.travel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.travel.entity.Userinfo;

public interface PackageRepository extends CrudRepository<Userinfo, Long> {
//	public List<Userinfo> findById(Userinfo userid);
}

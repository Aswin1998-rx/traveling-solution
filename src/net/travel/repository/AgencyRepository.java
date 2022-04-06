package net.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.travel.entity.AgencyDetails;


@Repository("agencyrepository")
public interface AgencyRepository extends JpaRepository<AgencyDetails, Long> {
	@Query("select a from AgencyDetails  a where a.aname =:aname and a.password=:password " )
	  public AgencyDetails loginagency(@Param("aname")String aname,@Param("password") String password);
}

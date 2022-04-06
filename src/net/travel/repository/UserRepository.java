package net.travel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import net.travel.entity.Userinfo;

@Repository("userrepository")
public interface UserRepository extends JpaRepository<Userinfo,Long> {
	  @Query("select a from Userinfo  a where a.name=:name and a.password=:password " )
	  public Userinfo loginuser(@Param("name")String name,@Param("password") String password);
	   
	  @Query("select c from Userinfo c where c.userid=:userid")
		public List<Userinfo> displayd(@Param("userid")Long userid);
//	  void register(Userinfo userinfo);

//	  Userinfo validateUser(Login login);
}

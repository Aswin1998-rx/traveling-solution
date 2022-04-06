package net.travel.service;

import java.util.List
;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//import org.springframework.transaction.annotation.Transactional;

//import com.fod.entity.Student;

import org.springframework.jdbc.core.JdbcTemplate;


import net.travel.entity.Userinfo;
import net.travel.repository.UserRepository;

@Service

public class UserService implements UserServiceI {
	@Autowired UserRepository urepo;

	@Override
	public void save(Userinfo userid) {
		urepo.save(userid);
		
	}
	

	@Override
	public List<Userinfo> displayd(Long userid) {
		// TODO Auto-generated method stub
		return urepo.displayd(userid);
	}


	@Override
	public List<Userinfo> listAll() {
		// TODO Auto-generated method stub
		return (List<Userinfo>) urepo.findAll();
	}

	@Override
	public Userinfo get(Long userid) {
		// TODO Auto-generated method stub
		return (Userinfo) urepo.findById(userid).get();
	}

	@Override
	public void delete(Long userid) {
		urepo.deleteById(userid);
		
	}

	@Override
	public Userinfo loginuser(String name, String password) {
		// TODO Auto-generated method stub
		return urepo.loginuser(name, password);
	}

	
	




//  class UserMapper implements RowMapper<Userinfo> {
//
//  public Userinfo mapRow(ResultSet rs, int arg1) throws SQLException {
//    Userinfo userinfo = new Userinfo();
//
//    userinfo.setName(rs.getString("name"));
//    userinfo.setPassword(rs.getString("password"));
////    user.setFirstname(rs.getString("firstname"));
////    user.setLastname(rs.getString("lastname"));
////    user.setEmail(rs.getString("email"));
//    userinfo.setDistrict(rs.getString("district"));
//    userinfo.setPhone_no(rs.getInt("phone_no"));
//
//    return userinfo;
//  }
  }
  

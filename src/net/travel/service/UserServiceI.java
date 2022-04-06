package net.travel.service;

import java.util.List;



import net.travel.entity.Userinfo;

public interface UserServiceI {

	public void save(Userinfo userid);

	public List<Userinfo> listAll();

	public Userinfo get(Long userid);

	public void delete(Long userid); 
	public List<Userinfo> displayd(Long userid);
	

	  public Userinfo loginuser(String name,String password);
	 
}

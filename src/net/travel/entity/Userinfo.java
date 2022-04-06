package net.travel.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(name="userinfo")
public class Userinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	public long userid;
	
	
	@Column(name="name")
	public String name;
	@Column(name="district")
	public String district;
	@Column(name="phone_no")
	public long phone_no;
	@Column(name="password")
	public String password;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Userinfo(long userid, String name, String district, long phone_no, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.district = district;
		this.phone_no = phone_no;
		this.password = password;
	}
	public Userinfo() {
		
	}
	
	
}

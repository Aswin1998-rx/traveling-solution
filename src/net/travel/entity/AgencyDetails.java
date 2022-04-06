package net.travel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agency_details")
public class AgencyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="agency_id")
	Long agencyid;
	
	@Column (name="aname")
	String aname;
	
	@Column (name="mobile_number")
	int mobileno;

	@Column(name="password")
	String password;

	public Long getAgencyid() {
		return agencyid;
	}

	public void setAgencyid(Long agencyid) {
		this.agencyid = agencyid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AgencyDetails(Long agencyid, String aname, int mobileno, String password) {
		super();
		this.agencyid = agencyid;
		this.aname = aname;
		this.mobileno = mobileno;
		this.password = password;
	}

	public AgencyDetails() {
	
	}
	
	
	


}

package net.travel.entity;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bid")
	public long bid;
	
@Column(name="uname")
public String uname;

@Column(name="packid")
public Long packid;

@Column(name="mobile_no")
public int mobile_no;

public long getBid() {
	return bid;
}

public void setBid(long bid) {
	this.bid = bid;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public Long getPackid() {
	return packid;
}

public void setPackid(Long packid) {
	this.packid = packid;
}

public int getMobile_no() {
	return mobile_no;
}

public void setMobile_no(int mobile_no) {
	this.mobile_no = mobile_no;
}

public Booking(long bid, String uname, Long packid, int mobile_no) {
	super();
	this.bid = bid;
	this.uname = uname;
	this.packid = packid;
	this.mobile_no = mobile_no;
}

public Booking() {
	
}

}

package net.travel.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="travel_pack")
public class TravelPack implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="pack_id")
	Long pack_id;
	
	
	@Column (name="agency_name")
	String agency_name;
	
	@Column (name="district")
	String district;
	
	@Column (name="destination")
	String destination;
	
	
	
	@Column (name="no_of_seat")
	int no_of_seat;
	
	@Column (name="total_fee")
	int total_fee;
	
    
	public TravelPack() {
		
	}

	public TravelPack(Long pack_id, String agency_name, String district, String destination,
			int no_of_seat, int total_fee) {
		super();
		this.pack_id = pack_id;
		this.agency_name = agency_name;
		this.district = district;
		this.destination = destination;
		
		this.no_of_seat = no_of_seat;
		this.total_fee = total_fee;
	}

	public Long getPack_id() {
		return pack_id;
	}

	public void setPack_id(Long pack_id) {
		this.pack_id = pack_id;
	}

	public String getAgency_name() {
		return agency_name;
	}

	public void setAgency_name(String agency_name) {
		this.agency_name = agency_name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	

	

	public int getNo_of_seat() {
		return no_of_seat;
	}

	public void setNo_of_seat(int no_of_seat) {
		this.no_of_seat = no_of_seat;
	}

	public int getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "travel pack";
	}
	
	
	

}

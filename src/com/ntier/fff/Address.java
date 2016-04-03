package com.ntier.fff;

public class Address {
	private int id;
	private String streetAddress;
	private String streetAddress2;
	private String city;
	private String State;
	private String zip;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", streetAddress2=" + streetAddress2 + ", city=" + city
				+ ", State=" + State + ", zip=" + zip + "]";
	}
	
	
}

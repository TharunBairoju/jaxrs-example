package com.wave.sample.entity;

public class WorkLocation 
{
	int LocID;
	String hospitalName;
	int doorNumber;
	String AddressLine1;
	String AddressLine2;
	String location;
	String city;
	int pincode;
	String state;
	User u;
	public WorkLocation() {}
	public WorkLocation(int locID, String hospitalName, int doorNumber, String addressLine1, String addressLine2,
			String location, String city, int pincode, String state, User u) 
	{
		LocID = locID;
		this.hospitalName = hospitalName;
		this.doorNumber = doorNumber;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		this.location = location;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.u = u;
	}
	public int getLocID() {
		return LocID;
	}
	public void setLocID(int locID) {
		LocID = locID;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	

}

package com.wave.sample.entity;

public class Booking 
{
	int bookingID;
	String bookingStatus;
	String PatientID;
	String DocID;
	TimeSlots ts;
	Slots s;
	User u;
	public Booking() {}
	public Booking(int bookingID, String bookingStatus, String patientID, String docID, TimeSlots ts, Slots s, User u) {
	
		this.bookingID = bookingID;
		this.bookingStatus = bookingStatus;
		PatientID = patientID;
		DocID = docID;
		this.ts = ts;
		this.s = s;
		this.u = u;
	}
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getPatientID() {
		return PatientID;
	}
	public void setPatientID(String patientID) {
		PatientID = patientID;
	}
	public String getDocID() {
		return DocID;
	}
	public void setDocID(String docID) {
		DocID = docID;
	}
	public TimeSlots getTs() {
		return ts;
	}
	public void setTs(TimeSlots ts) {
		this.ts = ts;
	}
	public Slots getS() {
		return s;
	}
	public void setS(Slots s) {
		this.s = s;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	
	

}

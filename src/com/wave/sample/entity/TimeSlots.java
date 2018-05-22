package com.wave.sample.entity;

import java.sql.Time;

public class TimeSlots 
{
	int timeSlotID;
	Time fromTime;
	Time toTime;
	String timeSlotStatus;
	Slots s;
	public TimeSlots() {}
	public TimeSlots(int timeSlotID, Time fromTime, Time toTime, String timeSlotStatus, Slots s) {
		super();
		this.timeSlotID = timeSlotID;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.timeSlotStatus = timeSlotStatus;
		this.s = s;
	}
	public int getTimeSlotID() {
		return timeSlotID;
	}
	public void setTimeSlotID(int timeSlotID) {
		this.timeSlotID = timeSlotID;
	}
	public Time getFromTime() {
		return fromTime;
	}
	public void setFromTime(Time fromTime) {
		this.fromTime = fromTime;
	}
	public Time getToTime() {
		return toTime;
	}
	public void setToTime(Time toTime) {
		this.toTime = toTime;
	}
	public String getTimeSlotStatus() {
		return timeSlotStatus;
	}
	public void setTimeSlotStatus(String timeSlotStatus) {
		this.timeSlotStatus = timeSlotStatus;
	}
	public Slots getS() {
		return s;
	}
	public void setS(Slots s) {
		this.s = s;
	}
	
	

}

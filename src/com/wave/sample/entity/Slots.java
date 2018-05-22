package com.wave.sample.entity;

import java.util.Date;

public class Slots 
{
	int slotID;
	Date date;
	int slotDuration;
	String slotStatus;
	User u;
	public Slots() {}
	public Slots(int slotID, Date date, int slotDuration, String slotStatus, User u) 
	{
		this.slotID = slotID;
		this.date = date;
		this.slotDuration = slotDuration;
		this.slotStatus = slotStatus;
		this.u = u;
	}
	public int getSlotID() {
		return slotID;
	}
	public void setSlotID(int slotID) {
		this.slotID = slotID;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getSlotDuration() {
		return slotDuration;
	}
	public void setSlotDuration(int slotDuration) {
		this.slotDuration = slotDuration;
	}
	public String getSlotStatus() {
		return slotStatus;
	}
	public void setSlotStatus(String slotStatus) {
		this.slotStatus = slotStatus;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	

}

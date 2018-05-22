package com.wave.sample.entity;

import java.util.Date;

public class User 
{
	int userID;
	String title;
	String firstName;
	String middleName;
	String lastName;
	Date dob;
	String gender;
	String isActive;
	String UserName;
	String password;

	String emailID;
	String contactNumber;
	Role r;
	public User() {}
	public User(int userID, String title, String firstName, String middleName, String lastName, Date dob, String gender,
			Role r, String isActive, String userName, String emailID, String contactNumber) {
		this.userID = userID;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.r = r;
		this.isActive = isActive;
		UserName = userName;
		this.emailID = emailID;
		this.contactNumber = contactNumber;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		userID = userID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		gender = gender;
	}

	public Role getR() {
		return r;
	}
	public void setR(Role r) {
		this.r = r;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

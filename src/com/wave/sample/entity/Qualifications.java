package com.wave.sample.entity;

public class Qualifications 
{
	int QiD;
	String Degree;
	String Specialization;
	int reg_num;
	int experience;
	User u;
	public Qualifications() {}
	public Qualifications(int qiD, String degree, String specialization, int reg_num, int experience, User u) 
	{
		QiD = qiD;
		Degree = degree;
		Specialization = specialization;
		this.reg_num = reg_num;
		this.experience = experience;
		this.u = u;
	}
	public int getQiD() {
		return QiD;
	}
	public void setQiD(int qiD) {
		QiD = qiD;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public int getReg_num() {
		return reg_num;
	}
	public void setReg_num(int reg_num) {
		this.reg_num = reg_num;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	

}

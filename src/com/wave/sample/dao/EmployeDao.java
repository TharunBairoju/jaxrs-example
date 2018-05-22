package com.wave.sample.dao;

import java.util.ArrayList;
import java.util.List;

import com.wave.sample.entity.Employee;

public class EmployeDao {

	public List<Employee> getAllEmployees() {
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee(101,"Ajay",1000));
		elist.add(new Employee(102,"Babu",1000));
		elist.add(new Employee(103,"Sujay",1000));
		elist.add(new Employee(104,"Bijay",1000));
		return elist;
	}

}

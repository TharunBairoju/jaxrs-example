package com.wave.sample.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wave.sample.dao.EmployeDao;
import com.wave.sample.entity.Employee;

@Path("/emp")
public class EmployeeResource {
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeAllDetails() 
	{
		List<Employee> emps=new EmployeDao().getAllEmployees();
		System.out.println("returning response");
		return Response
			      .status(200)
			      .header("Access-Control-Allow-Origin", "*")
			      .header("Access-Control-Allow-Credentials", "true")
			      .header("Access-Control-Allow-Headers",
			        "origin, content-type, accept, authorization")
			      .header("Access-Control-Allow-Methods", 
			        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
			      .entity(emps)
			      .build();
	}
}

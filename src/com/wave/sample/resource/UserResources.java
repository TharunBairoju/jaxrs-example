package com.wave.sample.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wave.sample.dao.UserDAO;
import com.wave.sample.entity.User;



@Path("/user")
public class UserResources 
{
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUserAllDetails()
	{
		//List<User> users=new UserDAO().getAllUsers();
		return new ArrayList<>();
	}

	@GET
	@Path("/{username}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User getUserName(@PathParam("username") String Username) 
	{
		
		return new UserDAO().getUser(Username);
	}
	@POST
	@Path("/add")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public String createUser(User user) 
	{
		System.out.println("Hello");
		String message ="User cannot be added";
		if(new UserDAO().createUser(user))
			message="User added succssfully";
		return message;
				
	}

}

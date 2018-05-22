package com.wave.sample.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.wave.sample.entity.User;
import com.wave.sample.entity.WorkLocation;



public class WorkLocationDAO 
{
	Configuration config=null;
	SessionFactory factory=null;
	public WorkLocationDAO() 
	{
		config=new Configuration();
		config.configure();
		this.factory=config.buildSessionFactory();
	}

	public boolean createWorkLocation(WorkLocation location) 
	{
		Session session = null;
		Transaction trans=null;
		int id=0;
		try 
		{
			session=factory.openSession();
			trans=session.beginTransaction();
			id=(Integer)session.save(location);
			trans.commit();			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return id!=0;
	}
	public WorkLocation getWorkLocation(String location) 
	{
		Session session = null;
		Criteria cr=session.createCriteria(WorkLocation.class);
		cr.add(Restrictions.eq("location", "?"));
		WorkLocation loc = (WorkLocation) cr.uniqueResult();
		return loc;
		
	}
	public List<WorkLocation> getAllWorkLocations()
	{
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(User.class);
		List<WorkLocation> locList = cr.list();
	/*	SQLQuery qry = session.createSQLQuery("select * from users");
		qry.addEntity(User.class);
		List<WorkLocation> locList=qry.list();*/
		session.close();
		return locList;
	}


}

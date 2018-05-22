package com.wave.sample.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.wave.sample.entity.TimeSlots;



public class TimeSlotsDAO 
{
	Configuration config=null;
	SessionFactory factory=null;
	public TimeSlotsDAO() 
	{
		config=new Configuration();
		config.configure();
		this.factory=config.buildSessionFactory();
	}

	public boolean createTimeSlot(TimeSlots tslot) 
	{
		Session session = null;
		Transaction trans=null;
		int id=0;
		try 
		{
			session=factory.openSession();
			trans=session.beginTransaction();
			id=(Integer)session.save(tslot);
			trans.commit();			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return id!=0;
	}
	public TimeSlots gettSlot(String timeSlotStatus) 
	{
		Session session = null;
		Criteria cr=session.createCriteria(TimeSlots.class);
		cr.add(Restrictions.eq("tileSlotStatus", "?"));
		TimeSlots tslot = (TimeSlots) cr.uniqueResult();
		return tslot;
		
	}
	public List<TimeSlots> getAllTimeSlots()
	{
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(TimeSlots.class);
		List<TimeSlots> slotList = cr.list();
	/*	SQLQuery qry = session.createSQLQuery("select * from users");
		qry.addEntity(User.class);
		List<WorkLocation> locList=qry.list();*/
		session.close();
		return slotList;
	}

}

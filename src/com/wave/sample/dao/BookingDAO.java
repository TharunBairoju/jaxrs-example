package com.wave.sample.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.wave.sample.entity.Booking;





public class BookingDAO 
{
	Configuration config=null;
	SessionFactory factory=null;
	public BookingDAO() 
	{
		config=new Configuration();
		config.configure();
		this.factory=config.buildSessionFactory();
	}

	public boolean createBooking(Booking b) 
	{
		Session session = null;
		Transaction trans=null;
		int id=0;
		try 
		{
			session=factory.openSession();
			trans=session.beginTransaction();
			id=(Integer)session.save(b);
			trans.commit();			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return id!=0;
	}
	public Booking getBookingByPatient(int patientID) 
	{
		Session session = null;
		Criteria cr=session.createCriteria(Booking.class);
		cr.add(Restrictions.eq("patientID", "?"));
		Booking b = (Booking) cr.uniqueResult();
		return b;
		
	}
	public Booking getBookingByDoctor(int docID) 
	{
		Session session = null;
		Criteria cr=session.createCriteria(Booking.class);
		cr.add(Restrictions.eq("docID", "?"));
		Booking b = (Booking) cr.uniqueResult();
		return b;
		
	}
	public List<Booking> getAllBookings()
	{
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Booking.class);
		List<Booking> bList = cr.list();
	/*	SQLQuery qry = session.createSQLQuery("select * from users");
		qry.addEntity(User.class);
		List<WorkLocation> locList=qry.list();*/
		session.close();
		return bList;
	}

}

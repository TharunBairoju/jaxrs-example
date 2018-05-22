package com.wave.sample.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.wave.sample.entity.Slots;



public class SlotsDAO 
{
	Configuration config=null;
	SessionFactory factory=null;
	public SlotsDAO() 
	{
		config=new Configuration();
		config.configure();
		this.factory=config.buildSessionFactory();
	}

	public boolean createSlot(Slots slot) 
	{
		Session session = null;
		Transaction trans=null;
		int id=0;
		try 
		{
			session=factory.openSession();
			trans=session.beginTransaction();
			id=(Integer)session.save(slot);
			trans.commit();			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return id!=0;
	}
	public Slots getSlot(Date date) 
	{
		Session session = null;
		Criteria cr=session.createCriteria(Slots.class);
		cr.add(Restrictions.eq("date", "?"));
		Slots slot = (Slots) cr.uniqueResult();
		return slot;
		
	}
	public List<Slots> getAllSlots()
	{
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Slots.class);
		List<Slots> slotList = cr.list();
	/*	SQLQuery qry = session.createSQLQuery("select * from users");
		qry.addEntity(User.class);
		List<WorkLocation> locList=qry.list();*/
		session.close();
		return slotList;
	}

}

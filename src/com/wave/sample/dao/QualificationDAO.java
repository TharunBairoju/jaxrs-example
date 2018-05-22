package com.wave.sample.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.wave.sample.entity.Qualifications;




public class QualificationDAO 
{
	Configuration config=null;
	SessionFactory factory=null;
	public QualificationDAO() 
	{
		config=new Configuration();
		config.configure();
		this.factory=config.buildSessionFactory();
	}

	public boolean createTimeSlot(Qualifications q) 
	{
		Session session = null;
		Transaction trans=null;
		int id=0;
		try 
		{
			session=factory.openSession();
			trans=session.beginTransaction();
			id=(Integer)session.save(q);
			trans.commit();			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return id!=0;
	}



}

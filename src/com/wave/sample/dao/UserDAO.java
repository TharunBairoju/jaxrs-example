package com.wave.sample.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.wave.sample.entity.User;



public class UserDAO 
{
	Configuration config=null;
	SessionFactory factory=null;
	public UserDAO() 
	{
		config=new Configuration();
		config.configure();
		this.factory=config.buildSessionFactory();
	}

	public boolean createUser(User user) 
	{
		Session session = null;
		Transaction trans=null;
		int id=0;
		try 
		{
			session=factory.openSession();
			trans=session.beginTransaction();
			id=(int) session.save(user);
			trans.commit();			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return id!=0;
	}
	public User getUser(String username) 
	{
		Session session = null;
		Criteria cr=session.createCriteria(User.class);
		cr.add(Restrictions.eq("username", "?"));
		User user = (User) cr.uniqueResult();
		return user;
		
	}
	public List<User> getAllUsers()
	{
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(User.class);
		List<User> results = cr.list();
	/*	SQLQuery qry = session.createSQLQuery("select * from users");
		qry.addEntity(User.class);
		List<User> uList=qry.list();*/
		session.close();
		return results;
	}
	
/*	public boolean authenticateUser(User u) 
	{
		Configuration config=null;
		SessionFactory factory=null;
		
		Connection con = null;
		PreparedStatement pst =null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		int count = 0;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("select * from users where username=? and password=?");
			pst.setString(1, u.getUserName());pst.setString(2, u.getPassword());
			rs = pst.executeQuery();
			if(rs.next())
				count=1;
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if(rs!=null)rs.close();
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return count ==1;
	}*/

}

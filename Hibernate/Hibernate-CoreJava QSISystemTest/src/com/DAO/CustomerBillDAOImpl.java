package com.DAO;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.HibernateConnection.HibernateUtil;
import com.model.Bill;

public class CustomerBillDAOImpl implements CustomerBillDAO
{
	
	@Override
	public void insertBills(Bill bill) throws SQLException 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 Transaction tx=session.beginTransaction();
		
		try
		{
			int rowcount=(Integer) session.save(bill);
		    if(rowcount!=0)
			  System.out.println(rowcount +" row(s) inserted sucessfully into bill table");
		
		    tx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bill> getBills() throws SQLException 
	{
		 List<Bill> list=new ArrayList<>();
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 Transaction tx=session.beginTransaction();
			
		try
		{
		 
		 list=session.createQuery("from bill").list();
		 tx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return list;
	}
	

}

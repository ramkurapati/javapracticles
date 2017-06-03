package com.HibernateConnection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	
	 private static SessionFactory sessionFactory;

	 public static SessionFactory getSessionFactory() {
	    	try 
		       {
		           sessionFactory = new Configuration().configure().buildSessionFactory();
		        }
		        catch(Throwable t) 
		        {
		            throw new ExceptionInInitializerError(t);
		        }
	        return sessionFactory;
	 }
	    
}

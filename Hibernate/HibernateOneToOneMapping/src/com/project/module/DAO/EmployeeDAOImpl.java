package com.project.module.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.module.model.Employee;
import com.project.module.model.Address;
import com.project.module.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public void insertEmployee(Employee employee) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			 session.save(employee);
			 tx.commit();	 
		}
		catch(Exception e){
			 System.out.println("error "+e);
			 tx.rollback();
		}
		finally{
			session.close();
		}
		
	}

	@Override
	public Employee getEmployee(int id) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = null; 
		Employee emp=null;
		List<Employee> employees=new ArrayList<Employee>();
		try{
			tx = session.beginTransaction();
			  //emp=(Employee) session.get(Employee.class, id);
			  //System.out.println("load method calling");
			  //emp=(Employee) session.load(Employee.class, id);
			
		/////////By using Query Object ////////////
			String sql="FROM Employee WHERE empId="+id;
			Query query=session.createQuery(sql);
			 employees=query.list();
			 tx.commit();	 
		}
		catch(Exception e){
			 System.out.println("error "+e);
			 tx.rollback();
		}
		finally{
			session.close();
		}
		return employees.get(0);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = null; 
		Employee emp=null;
		List<Employee> employees =new ArrayList<Employee>();
		try{
			tx = session.beginTransaction();
			String sql = "FROM Employee"; 
			Query query = session.createQuery(sql);
			query.setFirstResult(1); 
			query.setMaxResults(2);
			 employees = query.list();
			 tx.commit();	 
		}
		catch(Exception e){
			 System.out.println("error "+e);
			 tx.rollback();
		}
		finally{
			session.close();
		}
		
		return employees;
	}

	@Override
	public void updateEmployee(int id, int sal) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			 Employee emp=(Employee) session.get(Employee.class, id);
			 tx.commit();
			 emp.setSalary(sal);
			 Transaction tx2=session.beginTransaction();
			 
			 //session.update(emp);
			 //session.saveOrUpdate(emp);
			Employee emp2 = (Employee) session.merge(emp);
			System.out.println(emp==emp2);
			 tx2.commit();	 
		}
		catch(Exception e){
			 System.out.println("error "+e);
			 tx.rollback();
		}
		finally{
			session.close();
		}
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			 Employee emp2=(Employee) session.get(Employee.class, emp.getEmpId());
			
			 emp2.setLastName(emp.getLastName());
			 emp2.setSalary(emp.getSalary());
			 
			 
			session.update(emp2);
			 tx.commit();	 
		}
		catch(Exception e){
			 System.out.println("error "+e);
			 tx.rollback();
		}
		finally{
			session.close();
		}
		
		
	}

	@Override
	public void removeEmployee(int id) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			 Employee emp=(Employee) session.get(Employee.class, id);
			 session.delete(emp);
			 tx.commit();	 
		}
		catch(Exception e){
			 System.out.println("error "+e);
			 tx.rollback();
		}
		finally{
			session.close();
		}
		
	}

}

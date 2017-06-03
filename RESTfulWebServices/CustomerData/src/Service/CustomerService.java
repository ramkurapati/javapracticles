package Service;

import java.sql.SQLException;
import java.util.List;

import datatable.Database;

import model.Customer;

public class CustomerService 
{
	   public static CustomerService custService = new CustomerService();
	  
	    public static CustomerService getInstance() 
		{
		  return custService;
		}
	  
	   public List<Customer> getCustomerAll() throws ClassNotFoundException, SQLException 
	   {
		   
		  List<Customer> ls =new Database().getLoad();
		
		  return ls;
		
		}

		public List<Customer> getCustomer(int custid) throws ClassNotFoundException, SQLException
		{
			List<Customer> ls=null;
			
		    return ls;
		}

		
		
		}
	


package datatable;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class Database 
{

	public List<Customer> getLoad()
	{
		List<Customer> list=new ArrayList<Customer>();
    	list.add(new Customer(12345,"Rammohan naidu k",28,"Andhra Pradesh"));
    	list.add(new Customer(12346,"Rajendra Prasad k",30,"Andhra Pradesh"));
        list.add(new Customer(12347,"Mahendra Jalla",28,"Telangana"));
    
		return list;
	}
	
	
	
}

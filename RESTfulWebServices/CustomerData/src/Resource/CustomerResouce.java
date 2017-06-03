package Resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import Service.CustomerService;

import model.Customer;

@Path("/customers")
public class CustomerResouce
{
	@GET
	@Produces("application/xml")
	public List<Customer> getCustomersAll() 
	{
		List<Customer> als=null;
		try 
		{
		  als= CustomerService.getInstance().getCustomerAll();
		} 
		catch (ClassNotFoundException e)
		{
		e.printStackTrace();
		}
		catch (SQLException e)
		{
		e.printStackTrace();
		}
		return als;
		}
	
   

   @Path("/customer/{custid}")
   @GET
   @Produces ("application/json")

   public List<Customer> getUser(@PathParam("custid") int custid)
   {
	   
   List<Customer> asl=null;
   try 
   {
      asl= CustomerService.getInstance().getCustomer(custid);
   }
   catch (ClassNotFoundException e) 
   {
    e.printStackTrace();
    }
   catch (SQLException e)
   {
    e.printStackTrace();
    }
    return asl;
  }
   
}


package Test;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/tracking")
public class JsonFromRestful {
    
    @GET
    @Path("/{cusNo}")
    @Consumes(MediaType.APPLICATION_XML)
    public Customer produceCustomerDetailsinJSON(@PathParam("cusNo") long no) {
 
        /*
         * I AM PASSING CUST.NO AS AN INPUT, SO WRITE SOME BACKEND RELATED STUFF AND
         * FIND THE CUSTOMER DETAILS WITH THAT ID. AND FINALLY SET THOSE RETRIEVED VALUES TO
         * THE CUSTOMER OBJECT AND RETURN IT, HOWEVER IT WILL RETURN IN JSON FORMAT :-)
         * */
        
           Customer cust = new Customer();        
           HashMap<Long,Customer> datamap= cust.loadData();
           for(Entry<Long, Customer> entry:datamap.entrySet())
           {
        	   if(entry.getKey()==no)
        	   {
        		   
        		   cust=entry.getValue();
        	   }
           }
        return cust;
    }

}

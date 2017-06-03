package com.test.service;


import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myportal")
public class ProductCatalog
{
   
	ArrayList<String> plist=new ArrayList<String>();
	
     @GET
     @Path("/{prod}")
     @Produces(MediaType.TEXT_PLAIN)
	  public String  getProductsInfo(@PathParam("prod") String product)
	  {
    	 String productlist=null;
    	 if(product.equals("laptop"))
    	 {
    		 productlist="Dell inspiron,Dell Latitude"; 
    	 }
    	 else if(product.equals("printer"))
    	 {
    		 productlist="inkjet";
    	 }
    	 else
    	 {
    		 productlist="noproduct like that ";
    	     
    	 }
    	 return productlist;
    	
	  }
}

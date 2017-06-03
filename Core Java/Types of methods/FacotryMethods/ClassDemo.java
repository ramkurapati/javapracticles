package FacotryMethods;

import java.util.*;
import java.lang.*;

public class ClassDemo {

   public static void main(String[] args)
   {

     try 
     {
        // date object
        Date d = new Date();
        System.out.println("Time = " + d.toString());
       
        Class cls = d.getClass();
        /* creates a new instance of the class represented by this 
        Class object cls */
        Object obj = cls.newInstance();
        System.out.println("Time = " + obj);
      
     }
     catch(InstantiationException e)
     {
        System.out.println(e.toString());
     }
     catch(IllegalAccessException e) 
     {
        System.out.println(e.toString());
     }
   }
} 

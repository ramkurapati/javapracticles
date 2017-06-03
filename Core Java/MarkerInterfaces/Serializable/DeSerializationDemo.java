package Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import Serializable.Employee;

public class DeSerializationDemo 
{
	public static void main(String args[])throws Exception
	{  
		Employee e=null;
		  try
		  {
		  FileInputStream fin=new FileInputStream("D:/employee.txt");  
		  ObjectInputStream in=new ObjectInputStream(fin);  
		  e=(Employee)in.readObject() ;
		  fin.close();
		  in.close();
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  
		  System.out.println("success"); 
		  System.out.println(" "+e.getAddress());
		  System.out.println(" "+e.getName());
		 }  
}

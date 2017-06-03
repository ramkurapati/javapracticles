package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Serialization.Employee;


public class SerializeDemo {

	
	public static void main(String[] args)
	{
		Employee e =new Employee("ravi","ATP",1234);
		e.name ="Rammohan";
		e.address ="Anantapur, AP";
		e.SSN =11122333;
		e.number =101;
		try 
		{
			FileOutputStream fileOut =new FileOutputStream("C:/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e); 
			out.close();
			//fileOut.close();
			}
		catch(IOException i) 
		{
			i.printStackTrace();
		}
	  }
}

package Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Serializable.Employee;


public class SerializeDemo {

	
	public static void main(String[] args)
	{
		Employee e =new Employee("ravi","ATP",1234);
		try 
		{
			FileOutputStream fileOut =new FileOutputStream("D:\\employee.txt");
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

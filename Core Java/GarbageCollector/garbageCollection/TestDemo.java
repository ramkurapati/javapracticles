package garbageCollection;

class Employee
{
	
	int age=24;
	Employee(int age)
	{
		this.age=age;
		System.out.println(" age "+age);
	}
	 public void finalize()
	   {
		System.out.println("object is garbage collected");
		}  
}
public class TestDemo {

	   public void finalize()
	   {
		System.out.println("object in test demo  is garbage collected");
		}  

	  
	 public static void main(String args[])
	 {  
		   
		 new TestDemo().finalize(); // unreferenced By annonymous object 
		 
		 TestDemo s1=new TestDemo();
		 
		 s1=null;  //unreferenced By nulling the reference 
		 
		 Employee e1=new Employee(25);
		 Employee e2=new Employee(26);
	
	     e1=e2;   // unreferenced By assigning a reference to another
	   
	     System.gc();
	     
	     s1=new TestDemo();
	     
	   
	    
	    
     }
}
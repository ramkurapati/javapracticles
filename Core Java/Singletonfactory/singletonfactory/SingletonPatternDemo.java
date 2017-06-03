package singletonfactory;

public class SingletonPatternDemo {

	 public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	     //Employee object3 = new Employee();

	      //Get the only object available
	      Employee object1 = Employee.createInstance();
	   
	      //show the message
	      object1.setName("ram");
	      System.out.println(object1.getName());
	      System.out.println(object1.hashCode());
	      Employee object2 = Employee.createInstance();//object1;
	     // object2.setName("mohan");
	      System.out.println(object2.getName());
	      System.out.println(object2.hashCode());
	      System.out.println(object1.equals(object2));
	      System.out.println(object1==object2);
	      
	   }
	}

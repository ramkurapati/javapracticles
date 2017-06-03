package SingletonDP;

public class SingletonPatternDemo {

	 public static void main(String[] args) 
	 {

	    
	      Car car1= Car.getInstance();
	      car1.model("BMW");
	      
	      Car car2= Car.getInstance();
	      car2.model("Hundai");
	      
	      System.out.println(car1==car2);
	      
	   }
	}

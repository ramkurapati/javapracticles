package Inheritance.HasARelationship;

public class Car implements Vehicle
{
	  String carname;
	  String carcolor;
	  Engine engn;
	  Car(String carname,String carcolor,Engine engn)
	  {
		 this.carname=carname;
		 this.carcolor=carcolor;
		 this.engn=engn;
	  }
     Speed sp=new Speed(20);//HAS-A relationship made here ,we create object of another class inside this class
     public void carinfo()
     {
    	 System.out.println("carname      : "+carname );
    	 System.out.println("carcolor     : "+carcolor );
    	 System.out.println("carmilage    : "+sp.milage);
    	 System.out.println("carcharsinum : "+engn.charsinum);
    	 System.out.println("carpower     : "+engn.power);
     }
    
	public static void main(String[] args) 
	{
		Engine engn=new Engine("E67RT888", 1200);
		Car c=new Car("Tata Indica","white", engn);
		c.carinfo();
		System.out.println(c instanceof Vehicle);
		
	}

}

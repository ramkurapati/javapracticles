package AccessSpecifiers;

public class PrivtemethodsAccessDemo
{
	
	public static void main(String[] args)
	{
		
      PrivtemethodsClass1 cls=new PrivtemethodsClass1();
     // error not visble
      //cls.Store("ram",25,'M');
      //System.out.println("User name : "+cls.getName());
      System.out.println("User age : "+cls.getAge());
      //System.out.println("User Gender : "+cls.getSex());
      
	}

}

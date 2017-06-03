package Static;

public class StaticFamily
{
	public static int age=10;
    static
     {
	  String  name="ram";
	  System.out.println("am first executed "+age);
    }
 
   

 static void sm()
{
	System.out.println("am executed "+age);

}

 static void sm1()
{
	System.out.println("am executed 1");
}

  public static void main(String[] args)
  {
	 
  }
  
}

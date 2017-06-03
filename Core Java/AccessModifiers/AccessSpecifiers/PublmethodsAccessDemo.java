package AccessSpecifiers;

public class PublmethodsAccessDemo
{
	
	public static void main(String[] args)
	{
		
      PublmethodsClass1 cls=new PublmethodsClass1();
      cls.Store("ram",25,'M');
      System.out.println("User name : "+cls.getName());
      System.out.println("User age : "+cls.getAge());
      System.out.println("User Gender : "+cls.getSex());
      
	}

}

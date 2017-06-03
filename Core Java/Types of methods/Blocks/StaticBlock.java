package Blocks;

public class StaticBlock 
{
	   static
       {
  	  System.out.println("am in static block");
       }
       {
			System.out.println("am in instance block2");
		}
       StaticBlock()
       {
    	   System.out.println("am in constructor ");
       }
       {
			System.out.println("am in instance block");
		}
       public void method()
       {
    	   System.out.println("am in method");   
       }
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InterruptedException 
	{
		
       //StaticBlock sb=new StaticBlock();
       Class<?> c=Class.forName("Blocks.StaticBlock");
       
       StaticBlock sb2=(StaticBlock) c.newInstance();
       synchronized(sb2)
       {
    	 sb2.wait(2000);
       }
       synchronized(sb2)
       {
       sb2.notify();
       }
       sb2.method();
       
        
      
	}

}

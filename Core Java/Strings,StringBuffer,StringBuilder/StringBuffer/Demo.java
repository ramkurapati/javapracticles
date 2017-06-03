package StringBuffer;

public class Demo
{

	public static void main(String[] args)
	{
	
     StringBuffer sb1=new StringBuffer("ram");
     System.out.println(sb1.hashCode());
     StringBuffer sb2=new StringBuffer("ram");
     System.out.println(sb2.hashCode());
     System.out.println(sb1.equals(sb2));
     StringBuffer sb3=new StringBuffer(sb2);
     System.out.println(sb3.hashCode());
     System.out.println(sb2.equals(sb3));
     
     
     
     
     
    
	}

}

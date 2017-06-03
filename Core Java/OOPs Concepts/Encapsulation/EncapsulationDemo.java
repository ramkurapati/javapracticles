package Encapsulation;

public class EncapsulationDemo
{
	public static void main(String a[]) 
	{
		 EncapTest encap = new EncapTest();
	      encap.setName("Raj");
	      encap.setAge(25);
	      encap.setIdNum("MS198765");

	      System.out.print("Name : " +    encap.getName()+ 
	                       " \nAge  : " + encap.getAge()+
	                       " \tId   : " + encap.getIdNum());//access not possible due to "private" method (private String getIdNum())
	      
         
	      System.out.println(encap.processDetails());
	}

}

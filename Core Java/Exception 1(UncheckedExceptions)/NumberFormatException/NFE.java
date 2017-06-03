package NumberFormatException;

public class NFE
{
	public static void main(String args[]) 
	{
		try
		{
		String str1= "10";
		int x = Integer.parseInt(str1);
		System.out.println(x*x); // prints 100  
		
			String str2= "ten";
			int y = Integer.parseInt(str2); 
			System.out.println(y*y);
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Unable to format. " ); 
		}
	} 
}



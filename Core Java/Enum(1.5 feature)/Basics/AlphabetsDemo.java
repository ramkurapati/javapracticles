package Basics;

public class AlphabetsDemo 
{
    public static void main(String[] args)
    {
    	 System.out.println("Alphabet AnimalNames ");
	   for(Alphabets alpha:Alphabets.values())
	   {
		 System.out.println(" "+alpha+" for "+alpha.getValue());
	   }
	
	 // Month month=Month.April;
	 // System.out.println( month.getValue());
	}
}

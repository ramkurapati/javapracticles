package NumberFormatException;

public class ConvertStringToNumber {

	public static void main(String[] args)
	  {
	    try
	    {
	      String s = "ram";// here "10" ok
	      int i = Integer.parseInt(s);
	      // this line of code will never be reached
	      System.out.println("int value = " + i);
	    }
	    catch (NumberFormatException nfe)
	    {
	      nfe.printStackTrace();
	    }
	  }

}

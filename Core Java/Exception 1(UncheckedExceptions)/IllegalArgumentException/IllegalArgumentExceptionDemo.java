package IllegalArgumentException;

class Percentage
{
	  private final int value;
	  
	  public Percentage(int val) 
	  {
		
		    if (val < 0 || val > 100) 
		    {
		      throw new IllegalArgumentException("Value given not in range of 0 - 100 ");
		    }
		   this.value = val;
		  }
		  
		

		  public int getValue() 
		  {
		    return value;
		  }
  }
public class IllegalArgumentExceptionDemo 
{

	public static void main(String[] args) 
	{
		
            Percentage per=new Percentage(120);
		
			
       System.out.println(" your percentage "+per.getValue());
	}

}

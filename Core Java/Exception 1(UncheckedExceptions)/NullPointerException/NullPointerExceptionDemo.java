package NullPointerException;

public class NullPointerExceptionDemo {
	public static void main(String[] args)
	{
     try{
      String str ="efgfd";
      String str1 = null;
      System.out.println(""+str.length());
      System.out.println(""+str1.length());
     }
     catch(NullPointerException e)
     {
    	 System.out.println("NullPointerException happend due to null asigned to string");
    	 
    			 
     }
	}

}

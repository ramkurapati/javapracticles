
package Random;

import java.util.Random;

public class GenerateRandomNumber
{
	public static void main(String[] args)
	{
	  Random rand = new Random();
	  int num = rand.nextInt(10);
	  System.out.println("Generated Random Number between 0 to 10 is : " + num);
	  int numNoRange = rand.nextInt();
	  System.out.println("Generated Random Number without specifying any range is : " + numNoRange);
	  double d=rand.nextGaussian();
	  System.out.println(" "+d);
	 }
}
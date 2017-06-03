package InterviewProgramms;

public class PrimeNumberDemo 
{
	public static void main(String[] args) 
	{
		int  i,j, res;
		boolean flag=true;
		for(i=551;i<1000;i++)
		{
			 for(j=2;j<=i/2;j++)
			  {
				res=i%j;
				if(res==0)
				{
					System.out.println(i + " is not Prime Number");
					break;
				}
			  }
				
		}
			
	}

}

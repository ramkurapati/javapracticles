package InterviewProgramms;

public class MultiplesOf3and5 {

	
	public static void main(String[] args) 
	{
		for(int i=1;i<=50;i++)
		{
			if(i%3==0)
			{
				System.out.println("ram");	
			}
			if(i%5==0)
			{
				System.out.println("mohan");
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println("rammohan"+i);
			}
		}

	}

}

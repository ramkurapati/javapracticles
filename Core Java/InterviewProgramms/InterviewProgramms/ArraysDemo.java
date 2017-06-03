package InterviewProgramms;

public class ArraysDemo 
{

	public static void main(String[] args)
	{
		String Array1[]={"ram","sham","rahul","manoj","kumar","raj","ramu","jhon","lalitha","kumari"};
		String Array2[]={"krishna","shami","david","ram","lalitha","rajkumar","kumar","jhansi","sham","maohar"};
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(Array1[i].equals(Array2[j]))
				 System.out.println("Duplicate String  "+Array1[i]);
			}
		}
		
		
		
	}

}
